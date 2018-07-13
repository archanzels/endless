package com.suman.endless.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suman.endless.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
	@Query("select r from Request r order by r.requiredDate asc")
	List<Request> findAll();
}
