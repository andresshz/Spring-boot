package com.example.microserviciosjava.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Usuario")
@Getter
@Setter
public class UsuarioEntity {

    @Id
    private String id;
    private String nombre;
    private String email;
}
