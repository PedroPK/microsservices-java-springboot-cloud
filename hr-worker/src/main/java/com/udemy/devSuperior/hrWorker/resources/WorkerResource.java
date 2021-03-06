package com.udemy.devSuperior.hrWorker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.devSuperior.hrWorker.entities.Worker;
import com.udemy.devSuperior.hrWorker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = this.repository.findAll();
		
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "{pId}")
	public ResponseEntity<Worker> findById(@PathVariable Long pId) {
		Worker worker = this.repository.findById(pId).get();
		return ResponseEntity.ok(worker);
	}
	
}