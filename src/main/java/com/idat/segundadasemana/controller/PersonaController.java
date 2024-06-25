package com.idat.segundadasemana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.segundadasemana.model.Persona;
import com.idat.segundadasemana.services.IPersonaService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService service;

    @GetMapping
    public List<Persona> listar() {
        return service.listar();
    }

}
