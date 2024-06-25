package com.idat.segundadasemana.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.idat.segundadasemana.model.Persona;

public interface IPersonaService{

    Persona registrar(Persona p);
    
    Persona modificar(Persona p);

    boolean eliminar(Long id);

    Persona buscar(Long id);

    List<Persona> listar();

    Page<Persona> listarPagina(Pageable pagina);
}
