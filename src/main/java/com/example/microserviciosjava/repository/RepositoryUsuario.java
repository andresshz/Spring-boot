package com.example.microserviciosjava.repository;

import com.example.microserviciosjava.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryUsuario extends MongoRepository<UsuarioEntity, String> {
}
