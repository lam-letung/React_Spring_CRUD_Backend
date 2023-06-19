package com.lamlt15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamlt15.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
