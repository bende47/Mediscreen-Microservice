package com.mediscreen.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mediscreen.entities.Patient;
import com.mediscreen.service.PatientService;


@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	/**
	 * Methode permettant d'ajouter les informations d'un patient
	 * @throws ParseException 
	 */
	
	@PostMapping(value="patient/add")
	public Patient add(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	/**
	 * Methode permettant de rechercher un patient
	 */
	
	@GetMapping(value="patient/find/{id}")
	public Patient find(@PathVariable("id") Long id) {
		return patientService.findPatient(id);
	}
	
	/**
	 * Methode permettant d'afficher la liste des patients
	 */
	
	@GetMapping(value="patient/all")
	public List<Patient> all() {
		return patientService.allPatient();
	}
	
	/**
	 * Methode permettant de modifier les informations d'un patient
	 */
	
	@PutMapping(value="patient/update/{id}")
	public Patient update(@RequestBody Patient patient,@PathVariable("id") Long id) {
		return patientService.updatePatient(patient, id);
	}
	
	/**
	 * Methode permettant de supprimer un patient
	 */
	
	@DeleteMapping(value="patient/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		 patientService.deletePatient(id);
	}
	
		
	
	
	
}
