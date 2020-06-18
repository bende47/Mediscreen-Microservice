package com.mediscreen.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mediscreen.repository.*;
import com.mediscreen.entities.History;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	private HistoryRepository historyRepository;

	@Override
	public History addHistory(History history) {
		history.setDateCreation(new Date());
		log.info("History ajouté avec succès:" + history.toString());
		return historyRepository.save(history);
	}

	@Override
	public History updateHistory(History history, String id) {
		History history2 = historyRepository.findHistoryById(id);
		
		if(history2!=null) {
			history2.setDateUpdate(new Date());
			history2.setIdPatient(history.getIdPatient());
			history2.setNotes(history.getNotes());
			historyRepository.save(history2);
			log.info("History update avec succès:" + history2.toString());
		}
		return history2;
	}

	@Override
	public List<History> allHistory() {		
		return historyRepository.findAllByOrderByIdDesc();
	}

	@Override
	public List<History> allHistoryByPatient(String idpatient) {
		return  historyRepository.findAllByOrderByIdDesc(idpatient);
	}
	
	@Override
	public History find(String id) {
		History history2 = historyRepository.findHistoryById(id);
		log.info("History:" + history2.toString());
		return history2;
	}

	@Override
	public void delete(String id) {
		History history2 = historyRepository.findHistoryById(id);
		historyRepository.delete(history2);		
	}

}
