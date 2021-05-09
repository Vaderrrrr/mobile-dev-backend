package com.lrz.services;

import com.lrz.dao.TestDao;
import com.lrz.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TestServices {

    @Autowired
    private TestDao testDao;

    //插入函数--插入新的item
    public String testInsert(){
        Test test = new Test();

        test.setAge(1);
        test.setName("lrz");

        testDao.save(test);

        return "ok insert" + test;
    }

//    /*
        public String testInsert(Test test){
            testDao.save(test);
            return "test insert ok";
        }
//    */

    //查询函数--按id查询
    public Test testSelect(){
        return testDao.getById(1);
    }

    //查询函数--按name查询
    public Test testSelectName(){
        return testDao.getByName("Mary");
    }

    //其实是update函数--可以细化
    public Test testSave(Test test){
        Test testNew = testDao.getOne(test.getId());
        //按id查询item
        testNew.setName(test.getName());
        //修改item的年龄
        testNew.setAge(test.getAge());
        //保存该item的新value
        testDao.save(test);
        return test;
    }

    //删除函数--按id删除（基本就是这样
    public String testDelete(Integer id){
        testDao.deleteById(id);
        return "ok";
    }
}