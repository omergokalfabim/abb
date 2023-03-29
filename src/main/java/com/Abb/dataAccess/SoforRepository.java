package com.Abb.dataAccess;

import com.Abb.entities.Sofor;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SoforRepository extends JpaRepository<Sofor,Long> {

}
