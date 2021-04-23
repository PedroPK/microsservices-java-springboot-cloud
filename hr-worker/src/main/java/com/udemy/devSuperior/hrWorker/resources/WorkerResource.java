package com.udemy.devSuperior.hrWorker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.devSuperior.hrWorker.entities.Worker;
import com.udemy.devSuperior.hrWorker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = this.repository.findAll();
		
		
		return ResponseEntity.ok(list);
	}
	
}