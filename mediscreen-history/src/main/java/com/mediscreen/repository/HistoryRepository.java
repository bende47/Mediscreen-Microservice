package com.mediscreen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediscreen.entities.History;

@Repository
public interface HistoryRepository extends MongoRepository<History, String> {
	@Query(value="{ idPatient : ?0 }", sort = "{id : -1}")
	List<History> findAllByOrderByIdDesc(String idpatient);
	
	@Query("{ id : ?0 }")
	History findHistoryById(String id);
	
	public List<History> findAllByOrderByIdDesc();

}
