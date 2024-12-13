package com.gm.groupemedimagh.repositories;


import com.gm.groupemedimagh.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test,Long> {
}
