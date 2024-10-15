package com.ClubLuz.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ClubLuz.app.variables.Club;

public interface ClubRepositorio extends MongoRepository<Club, String>{

}
