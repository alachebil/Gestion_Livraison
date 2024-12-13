package com.gm.groupemedimagh.repositories;

import com.gm.groupemedimagh.entities.Bl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBLRepo extends JpaRepository<Bl,Long> {
}
