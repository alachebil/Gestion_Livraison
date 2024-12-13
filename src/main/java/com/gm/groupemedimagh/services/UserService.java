package com.gm.groupemedimagh.services;

import com.gm.groupemedimagh.entities.Utilisateur;
import com.gm.groupemedimagh.repositories.IUserRepo;
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
public class UserService implements IUserService {

    IUserRepo iUserRepo;
    @Override
    public Utilisateur addUtilisateur(Utilisateur user) {
        return iUserRepo.save(user);
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return iUserRepo.findAll();
    }

    @Override
    public Utilisateur getUtilisateurById(long idUtilisateur) {
        return iUserRepo.findById(idUtilisateur).get();
    }

    @Override
    public void deleteUtilisateur(long idUtilisateur) {
        iUserRepo.deleteById(idUtilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur user) {
        return iUserRepo.save(user);
    }
}
