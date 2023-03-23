package com.Abb.dataAccess;

import com.Abb.entities.Hareket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HareketRepository extends JpaRepository<Hareket,Long> {
}
