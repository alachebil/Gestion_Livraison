package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Reclamation;

import java.util.List;

public interface IReclamationService {


    Reclamation addReclamation(Reclamation reclamation);
    List<Reclamation> getAllReclamation();
    Reclamation getReclamationById(long idReclamation);
    void deleteReclamation(long idReclamation);
    Reclamation updateReclamation(Reclamation reclamation);
}
