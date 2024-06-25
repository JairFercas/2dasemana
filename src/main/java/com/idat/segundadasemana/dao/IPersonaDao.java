package com.idat.segundadasemana.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.segundadasemana.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> { //crea repositorio en base al modelo de clase persona, con esto ya puedo ingresar a todos los metodos del repositorio, crear, buscar, eliminar, conpaginar, etc
    
}
