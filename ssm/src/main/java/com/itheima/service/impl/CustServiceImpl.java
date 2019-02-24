package com.itheima.service.impl;

import com.itheima.dao.CustDao;
import com.itheima.domain.Cust;
import com.itheima.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/22 21:19
 * @Version 1.0
 */
@Service
public class CustServiceImpl implements CustService {


    @Autowired
    private CustDao custDao;

    @Override
    public List<Cust> list() {
        return custDao.list();
    }

    @Override
    public int delete(Integer id) {
        return custDao.delete(id);
    }

    @Override
    public int add(Cust cust) {
        return custDao.add(cust);
    }

    @Override
    public List<Cust> search(String custName, String custType) {
        if (custName!=null&&custName!=""){
            custName="%"+custName+"%";
        }
        if (custType!=null&&custType!=""){
            custType="%"+custType+"%";
        }
        return custDao.search(custName, custType);
    }
}
