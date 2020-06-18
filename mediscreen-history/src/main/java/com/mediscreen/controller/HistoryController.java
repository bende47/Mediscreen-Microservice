package com.mediscreen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mediscreen.entities.History;
import com.mediscreen.service.HistoryService;

@RestController
public class HistoryController {

	@Autowired
	private HistoryService historyService;
	
	@PostMapping(value="patHistory/add")
	public History add(@RequestBody History history) {
		return historyService.addHistory(history);
	}
	
	@PutMapping(value="patHistory/update/{id}")
	public History update(@RequestBody History history,@PathVariable("id") String id) {
		return historyService.updateHistory(history,id);
	}
	
	@GetMapping(value="patHistory/find/{id}")
	public History find(@PathVariable("id") String id) {
		return historyService.find(id);
	}
	
	@GetMapping(value="patHistory/all")
	public List<History> all() {
		return historyService.allHistory();
	}
	
	@GetMapping(value="patHistory/allHistoryPatient/{idpatient}")
	public List<History> allHistoryPatient(@PathVariable("idpatient") String idpatient) {
		return historyService.allHistoryByPatient(idpatient);
	}
	
	@DeleteMapping(value="patHistory/delete/{id}")
	public void delete(@PathVariable("id") String id) {
		 historyService.delete(id);
	}
}
