package com.Abb.dataAccess;

import com.Abb.entities.Arac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AracRepository extends JpaRepository<Arac,Long> {
}
