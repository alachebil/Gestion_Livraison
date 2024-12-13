package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Bl;
import com.gm.groupemedimagh.repositories.IBLRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class BLService implements IBLService {

    @Autowired
     private IBLRepo blRepo;

    @Override
    public Bl addBl(Bl bl) {
        return blRepo.save(bl);
    }

    @Override
    public List<Bl> retrieveAllBl() {
        return blRepo.findAll();
    }

    @Override
    public Bl getBlById(long idBl) {
        return blRepo.findById(idBl).get();
    }

    @Override
    public void deleteBl(long idBl) {
        blRepo.deleteById(idBl);

    }

    @Override
    public Bl updateBl(Bl bl) {
        return blRepo.save(bl);
    }
}
