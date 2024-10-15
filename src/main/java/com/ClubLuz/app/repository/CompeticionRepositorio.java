package com.ClubLuz.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ClubLuz.app.variables.Competicion;

public interface CompeticionRepositorio extends MongoRepository<Competicion, String>{

}