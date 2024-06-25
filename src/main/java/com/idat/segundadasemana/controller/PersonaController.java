package com.idat.segundadasemana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.segundadasemana.model.Persona;
import com.idat.segundadasemana.services.IPersonaService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/personas")
// -> Pasa a .....
public class PersonaController { //4) Se controlan los servicios a utilizar creados del modelo
    //RECUERDA QUE LA CLASE ES SEGUN EL MODELO, EN ESTE CASO PERSONA, NO UTILIZAR STRING, INT, BOOLEAN, ETC
    //Solo listar y paginar, son objetos que contendran objetos de PERSONA
    @Autowired
    private IPersonaService service;

    @GetMapping
    public List<Persona> listarPersonas() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Persona buscarPersona(@PathParam("id") Long id) {
        return service.buscar(id);
    }

    @GetMapping("/listarpagina")
    public Page<Persona> listaPagina(Pageable pagina) {
        return service.listarPagina(pagina);
    }
    

    @PostMapping
    public ResponseEntity<Persona> registrarPersona(@RequestBody Persona pRegistrada) {
        Persona pN=service.registrar(pRegistrada);
        return new ResponseEntity<Persona>(pN,HttpStatus.CREATED);
    }

    @PutMapping("modificar/{id}")
    public Persona modificar(@RequestBody Persona personaje) {
        return service.modificar(personaje);
    }
    
    @DeleteMapping("/{id}")
    public Boolean eliminar(@PathVariable("id") Long id){
        return service.eliminar(id);
    }
    

}
