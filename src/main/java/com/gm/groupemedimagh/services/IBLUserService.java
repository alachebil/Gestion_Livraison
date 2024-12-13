package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.BLUser;
import com.gm.groupemedimagh.entities.Bl;

import java.util.List;

public interface IBLUserService {

    BLUser addBLUser(BLUser bluser);
    List<BLUser> getAllBLUser();
    BLUser getBLUserById(long idBLUser);
    void deleteBLUser(long idBLUser);
    BLUser updateBLUser(BLUser bluser);

}
