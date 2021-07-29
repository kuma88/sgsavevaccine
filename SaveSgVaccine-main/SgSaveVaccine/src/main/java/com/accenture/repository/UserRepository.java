package com.accenture.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.accenture.model.Users;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "users", itemResourceRel = "user")
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users getUserByUsername(String username);


	
}
