package com.idat.segundadasemana.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.idat.segundadasemana.model.Persona;
// -> Pasa a .....
public interface IPersonaService{ //2) se crean las interfaces del modelo "Persona" -> servicios de la interfaz
    //aqui es mas que nada poner el nombre de los metodos para los modelos
    Persona registrar(Persona p);
    
    Persona modificar(Persona p);

    boolean eliminar(Long id);

    Persona buscar(Long id);

    List<Persona> listar();

    Page<Persona> listarPagina(Pageable pagina);
}
