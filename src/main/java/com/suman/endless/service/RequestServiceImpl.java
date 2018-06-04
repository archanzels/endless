package com.suman.endless.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.endless.model.Request;
import com.suman.endless.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService {

	@Autowired
	private RequestRepository requestRepository;

	@Override
	public List<Request> findAll() {
		return requestRepository.findAll();
	}

	@Override
	public void deleteRequest(Integer id) {
		requestRepository.deleteById(id);
	}

	@Override
	public void saveRequest(Request request) {
		requestRepository.save(request);
	}

	@Override
	public Request findOne(Integer id) {
		return requestRepository.getOne(id);
	}
}
