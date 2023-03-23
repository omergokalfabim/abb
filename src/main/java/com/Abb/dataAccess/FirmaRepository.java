package com.Abb.dataAccess;

import com.Abb.entities.Firma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmaRepository extends JpaRepository<Firma,Long> {
}
