package com.gm.groupemedimagh.controllers;

import com.gm.groupemedimagh.entities.Bl;
import com.gm.groupemedimagh.entities.Test;
import com.gm.groupemedimagh.services.ITestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

    @Autowired
    ITestService testService;


    @GetMapping("/retrieve-all-tests")
    public List<Test> getTests() {
        return  testService.getAllTest();
    }

    @PostMapping("/add")
    public Test addTest(@RequestBody Test event){
        return testService.addTest(event);
    }

}
