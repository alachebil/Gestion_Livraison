package com.gm.groupemedimagh.repositories;

import com.gm.groupemedimagh.entities.BLUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBLUserRepository extends JpaRepository<BLUser,Long> {
}
