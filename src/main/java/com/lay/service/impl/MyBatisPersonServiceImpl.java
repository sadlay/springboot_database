package com.lay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lay.dao.MyBatisPersonDao;
import com.lay.pojo.Person;
import com.lay.service.MyBatisPersonService;

@Service
public class MyBatisPersonServiceImpl implements MyBatisPersonService {
    
    @Autowired
    MyBatisPersonDao myBatisPersonDao;
    
    @Override
    public Person getPerson(Long id) {
        return myBatisPersonDao.getPerson(id);
    }
    
}
