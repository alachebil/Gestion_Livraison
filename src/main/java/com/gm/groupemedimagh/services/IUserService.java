package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Utilisateur;

import java.util.List;

public interface IUserService {

    Utilisateur addUtilisateur(Utilisateur user);
    List<Utilisateur> getAllUtilisateur();
    Utilisateur getUtilisateurById(long idUtilisateur);
    void deleteUtilisateur(long idUtilisateur);
    Utilisateur updateUtilisateur(Utilisateur user);


}
