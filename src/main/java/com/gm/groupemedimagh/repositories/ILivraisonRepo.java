package com.gm.groupemedimagh.repositories;

import com.gm.groupemedimagh.entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivraisonRepo extends JpaRepository<Livraison,Long> {


}
