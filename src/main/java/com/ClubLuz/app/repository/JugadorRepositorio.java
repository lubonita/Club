package com.ClubLuz.app.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ClubLuz.app.variables.Jugador;

public interface JugadorRepositorio extends MongoRepository <Jugador, String>{

}
