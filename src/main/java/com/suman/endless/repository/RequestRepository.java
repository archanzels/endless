package com.suman.endless.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suman.endless.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
	
}
