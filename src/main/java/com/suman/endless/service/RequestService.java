package com.suman.endless.service;

import java.util.List;

import com.suman.endless.model.Request;

public interface RequestService {
	List<Request> findAll();

	void deleteRequest(Integer id);

	void saveRequest(Request request);

	Request findOne(Integer id);
	

}
