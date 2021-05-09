package com.lrz.controller;

import com.lrz.model.Test;
import com.lrz.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestServices testServices;

    @GetMapping(value = "/test")
    public String test(){
        return "test ok!";
    }

    @GetMapping(value = "/insert")
    public String insert(Test test){
        return "insert" + testServices.testInsert();
    }

    /*-------------------------------------------*/
    @GetMapping("/insert_test")
    public String insertTest() {
//        testServices.testInsert();
        return "insert by " + testServices.testInsert();
    }

    /*-------------------------------------------*/
    @GetMapping(value = "/save")
    public String save(@RequestBody Test  test){
        return "save" + testServices.testSave(test);
    }

    @GetMapping(value = "/select")
    public String select(){
        return "select " + testServices.testSelectName();
    }

    @GetMapping(value = "/delete")
    public String delete(Integer id){
        return "delete " + testServices.testDelete(id);
    }

    @PostMapping(value = "/insert_post")
    public String insert_post(@RequestBody Test test){
        System.err.println(test);
        return "insert_port " + testServices.testInsert(test);
    }
}
