package com.ClubLuz.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ClubLuz.app.variables.Asociacion;

public interface AsociacionRepositorio extends MongoRepository<Asociacion, String> {

}
