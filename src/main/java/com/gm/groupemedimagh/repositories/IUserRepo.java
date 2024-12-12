package com.gm.groupemedimagh.repositories;


import com.gm.groupemedimagh.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<Utilisateur,Long> {
}
