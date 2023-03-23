package com.Abb.dataAccess;

import com.Abb.entities.Tarife;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TarifeRepository extends JpaRepository<Tarife, Long> {
}
