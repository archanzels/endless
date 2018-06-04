package com.suman.endless.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.suman.endless.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
	
	@Query("select r from request r where r.group=:group")
	List<Request> fetchRequest(@Param("group") String group);
}
