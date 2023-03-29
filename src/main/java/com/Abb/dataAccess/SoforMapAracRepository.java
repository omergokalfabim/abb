package com.Abb.dataAccess;

import com.Abb.entities.SoforMapArac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoforMapAracRepository extends JpaRepository<SoforMapArac, Long> {
}
