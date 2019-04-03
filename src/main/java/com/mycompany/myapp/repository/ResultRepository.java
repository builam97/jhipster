package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

import com.mycompany.myapp.domain.Result;

// @SuppressWarnings("unused")
// @Repository
public interface ResultRepository extends JpaRepository<Result, Long>{

    @Query("select rs from Result rs Where rs.regional = ?1")
    public List<Result> findByRegionAndDate(Long regional, Instant date);
}
