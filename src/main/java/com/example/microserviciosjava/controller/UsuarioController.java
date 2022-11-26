package com.example.microserviciosjava.controller;

import com.example.microserviciosjava.entity.UsuarioEntity;
import com.example.microserviciosjava.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    RepositoryUsuario usuario;


    @GetMapping("/obtener")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<UsuarioEntity> usuarios (){
        return usuario.findAll();
    }

    @PostMapping("/ingresar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void Ingresar(@RequestBody UsuarioEntity usuarioEntity){
        usuario.save(usuarioEntity);
    }

}
