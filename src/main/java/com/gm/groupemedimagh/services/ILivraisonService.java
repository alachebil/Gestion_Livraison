package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Livraison;

import java.util.List;

public interface ILivraisonService {

    Livraison addLivraison(Livraison livraison);
    List<Livraison> getAllLivraison();
    Livraison getLivraisonById(long idLivraison);
    void deleteLivraison(long idLivraison);
    Livraison updateLivraison(Livraison livraison);

}
