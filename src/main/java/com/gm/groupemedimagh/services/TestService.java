package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Livraison;
import com.gm.groupemedimagh.entities.Test;
import com.gm.groupemedimagh.repositories.TestRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService implements  ITestService{

    TestRepo testRepo;
    @Override
    public Test addTest(Test test) {
        return testRepo.save(test);
    }

    @Override
    public List<Test> getAllTest() {
        return testRepo.findAll();
    }
}
