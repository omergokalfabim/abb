package com.Abb.dataAccess;

import com.Abb.entities.Arac;
import com.Abb.entities.AracMapFirma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AracMapFirmaRepository extends JpaRepository<AracMapFirma,Long> {
    @Query("SELECT u FROM AracMapFirma u join u.arac a WHERE a.plaka  = :plaka")
    List<AracMapFirma> findByPlaka(@Param("plaka") String plaka);

}
