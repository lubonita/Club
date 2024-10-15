package com.ClubLuz.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ClubLuz.app.variables.Entrenador;

public interface EntrenadorRepositorio extends MongoRepository <Entrenador, String>{

}
