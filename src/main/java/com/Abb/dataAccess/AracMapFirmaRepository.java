package com.Abb.dataAccess;

import com.Abb.entities.AracMapFirma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AracMapFirmaRepository extends JpaRepository<AracMapFirma,Long> {
}
