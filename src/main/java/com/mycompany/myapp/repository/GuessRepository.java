package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.Guess;

@SuppressWarnings("unused")
@Repository
public interface GuessRepository extends JpaRepository<Guess, Long>{

}
