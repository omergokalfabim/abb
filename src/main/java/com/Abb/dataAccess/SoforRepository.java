package com.Abb.dataAccess;

import com.Abb.entities.Sofor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoforRepository extends JpaRepository<Sofor,Long> {
}
