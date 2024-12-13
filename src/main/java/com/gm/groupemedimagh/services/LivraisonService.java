package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Livraison;
import com.gm.groupemedimagh.repositories.ILivraisonRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class LivraisonService implements ILivraisonService {

    ILivraisonRepo iLivraisonRepo;

    @Override
    public Livraison addLivraison(Livraison livraison) {
        return iLivraisonRepo.save(livraison);
    }

    @Override
    public List<Livraison> getAllLivraison() {
        return iLivraisonRepo.findAll();
    }

    @Override
    public Livraison getLivraisonById(long idLivraison) {
        return iLivraisonRepo.findById(idLivraison).get();
    }

    @Override
    public void deleteLivraison(long idLivraison) {
        iLivraisonRepo.deleteById(idLivraison);

    }
    @Override
    public Livraison updateLivraison(Livraison livraison) {
        return iLivraisonRepo.save(livraison);
    }
}
