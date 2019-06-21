package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.domain.UserExtra;

@SuppressWarnings("unused")
@Repository
public interface UserExtraRepository extends JpaRepository<UserExtra, Long>{
	 @Query("select ue from UserExtra ue join User u on ue.user = u Where ue.user.id = :userExtraId")
	UserExtra getUserExtraByid(@Param("userExtraId") Long userExtraId);
}
