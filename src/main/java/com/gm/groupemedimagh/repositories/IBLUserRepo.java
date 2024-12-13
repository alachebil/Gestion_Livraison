package com.gm.groupemedimagh.repositories;

import com.gm.groupemedimagh.entities.BLUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBLUserRepo extends JpaRepository<BLUser,Long> {
}
