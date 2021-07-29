package com.accenture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.accenture.model.Clinic;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "clinics", itemResourceRel = "clinic")
@Repository
public interface ClinicRepository extends  JpaRepository<Clinic, Integer> {

	List<Clinic> findAllById(int id);
	List<Clinic> findAllByName(String name);
	
}
