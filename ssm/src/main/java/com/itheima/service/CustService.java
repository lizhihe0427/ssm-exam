package com.itheima.service;

import com.itheima.domain.Cust;


import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 21:18
 * @Version 1.0
 */
public interface CustService {
    List<Cust> list();

    int delete(Integer id);

    int add(Cust cust);

    /**
     * 模糊查询
     * @param custName
     * @param custType
     * @return
     */
    List<Cust>search( String custName, String custType);
}
