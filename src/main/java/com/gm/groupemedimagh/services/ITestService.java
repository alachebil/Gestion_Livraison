package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Livraison;
import com.gm.groupemedimagh.entities.Test;

import java.util.List;

public interface ITestService {


    Test addTest(Test livraison);
    List<Test> getAllTest();
}
