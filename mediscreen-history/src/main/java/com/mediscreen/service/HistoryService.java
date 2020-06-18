package com.mediscreen.service;

import java.util.List;

import com.mediscreen.entities.History;

public interface HistoryService {
	/**
	 * 
	 * @param history
	 * @return Historique patient ajouté
	 */
	public History addHistory(History history);
	
	/**
	 * 
	 * @param history
	 * @param id
	 * @return Historique modifié
	 */
	public History updateHistory(History history, String id);
	
	/**
	 * 
	 * @return La liste des historiques des patients 
	 */
	public List<History> allHistory();
	
	/**
	 * 
	 * @param idpatient
	 * @return La liste des historiques d'un patient
	 */
	public List<History> allHistoryByPatient(String idpatient);

	/**
	 * 
	 * @param id
	 * @return Historique
	 */
	public History find(String id);
	
	/**
	 * 
	 * @param id
	 */
	public void delete(String id);
	
}
