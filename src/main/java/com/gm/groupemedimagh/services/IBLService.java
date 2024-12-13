package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Bl;

import java.util.List;

public interface IBLService {


    Bl addBl(Bl bl);
    List<Bl> retrieveAllBl();
    Bl getBlById(long idBl);
    void deleteBl(long idBl);
    Bl updateBl(Bl bl);
}
