package com.accenture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.accenture.model.Clinic;
import com.accenture.model.Request;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "requests", itemResourceRel = "request")
@Repository
public interface RequestRepository extends  JpaRepository<Request, Integer> {

}
