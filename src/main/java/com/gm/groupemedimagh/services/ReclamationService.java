package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Reclamation;
import com.gm.groupemedimagh.repositories.IReclamationRepo;
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
public class ReclamationService implements IReclamationService{

    IReclamationRepo iReclamationRepo;

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return iReclamationRepo.save(reclamation);
    }

    @Override
    public List<Reclamation> getAllReclamation() {
        return iReclamationRepo.findAll();
    }

    @Override
    public Reclamation getReclamationById(long idReclamation) {
        return iReclamationRepo.findById(idReclamation).get();
    }

    @Override
    public void deleteReclamation(long idReclamation) {
        iReclamationRepo.deleteById(idReclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation reclamation) {
        return iReclamationRepo.save(reclamation);
    }
}
