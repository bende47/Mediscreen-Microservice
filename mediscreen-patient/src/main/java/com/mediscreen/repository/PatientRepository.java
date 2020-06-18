package com.mediscreen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mediscreen.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

	@Query("select p from Patient p where p.name=:name and p.firstname=:firstname and p.phone=:phone")
	Patient findByPatient(@Param("name") String name, @Param("firstname") String firstname, @Param("phone") String phone);
	
	@Query("select p from Patient p where p.id=:id")
	Patient findPatientById(@Param("id") Long id);
	
	@Query("select p from Patient p ORDER BY p.id DESC")
	public List<Patient> findAllByOrderByIdDesc();
}
