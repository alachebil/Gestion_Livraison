package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.BLUser;
import com.gm.groupemedimagh.repositories.IBLUserRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BLUserService implements IBLUserService{

    IBLUserRepo iblUserRepo;

    @Override
    public BLUser addBLUser(BLUser bluser) {
        return iblUserRepo.save(bluser);
    }

    @Override
    public List<BLUser> getAllBLUser() {
        return iblUserRepo.findAll();
    }

    @Override
    public BLUser getBLUserById(long idBLUser) {
        return iblUserRepo.findById(idBLUser).get();
    }

    @Override
    public void deleteBLUser(long idBLUser) {
        iblUserRepo.deleteById(idBLUser);

    }

    @Override
    public BLUser updateBLUser(BLUser bluser) {
        return iblUserRepo.save(bluser);
    }
}
