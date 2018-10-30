package com.lay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lay.pojo.Person;
import com.lay.service.MyBatisPersonService;

@Controller
@RequestMapping(value = "mybatis")
public class MybatisController {
    @Autowired
    MyBatisPersonService myBatisPersonService;
    
    @RequestMapping(value = "getPerson")
    @ResponseBody
    public Person getPerson(@RequestParam("id") Long id) {
        return myBatisPersonService.getPerson(id);
    }
    
}
