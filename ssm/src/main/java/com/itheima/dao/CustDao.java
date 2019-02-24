package com.itheima.dao;

import com.itheima.domain.Cust;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 21:19
 * @Version 1.0
 */
public interface CustDao {

   @Select("select*FROM s_cust")
   @Results(
           value = {
                   @Result(
                           property = "users",//给sysRoles属性赋值 调用外部查询
                           column = "cust_link_user",//调用外部查询需要的参数 上面语句查询出来的id
                           one = @One(select = "com.itheima.dao.UserDao.listByCid")
                   ),
                   @Result(
                           property = "cid",
                           column ="cid",
                           id = true
                   )
           }
   )
    List<Cust>list();

   @Delete("delete from s_cust where cid=#{id}")
   int delete(@Param("id") Integer id);


   @Insert("insert into s_cust (cust_name,cust_type,cust_phone,cust_address,cust_link_user) values(#{cust_name},#{cust_type},#{cust_phone},#{cust_address},#{cust_link_user})")
    int add(Cust cust);

   @Select("SELECT*FROM s_cust where cust_name LIKE '${custName}' || cust_type LIKE'${custType}'")
   @Results(
           value = {
                   @Result(
                           property = "users",//给sysRoles属性赋值 调用外部查询
                           column = "cust_link_user",//调用外部查询需要的参数 上面语句查询出来的id
                           one = @One(select = "com.itheima.dao.UserDao.listByCid")
                   ),
                   @Result(
                           property = "cid",
                           column ="cid",
                           id = true
                   )
           }
   )
    List<Cust>search(@Param(value = "custName") String custName,@Param(value = "custType") String custType);
}
