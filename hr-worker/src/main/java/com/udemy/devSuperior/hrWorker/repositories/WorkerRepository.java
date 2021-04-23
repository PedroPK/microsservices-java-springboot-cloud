package com.udemy.devSuperior.hrWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.devSuperior.hrWorker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}