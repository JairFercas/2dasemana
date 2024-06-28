package com.idat.segundadasemana.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idat.segundadasemana.model.Persona;
import java.util.List;


public interface IPersonaDao extends JpaRepository<Persona, Long> { 
    //1.1)crea repositorio en base al modelo de clase persona
    //con esto ya puedo ingresar a todos los metodos del repositorio, crear, buscar, eliminar, conpaginar, etc
    
    //Desde aqui implementaremos los metodos personalizados como busqueda por un campo(dni o nombre)
    List<Persona> findByNombresAndApellidos(String nombres, String apellidos);

    //ejemplo para HQL , querys de Hibernate
    @Query(value = "from Persona p where idPersona=:id_persona")
    List<Persona> listarHQL(@Param("id_persona") Long id);

    @Query(value = "Select id_persona,nombres, apellidos from tbl_persona",nativeQuery = true) //El query nativo retorna un listado de objetos
    List<Object[]> listarNativo();

    //@Query(value="select * from fnc_listar(?1)", nativeQuery = true) // funcion para postgresql
    @Query(value="call listaPersona(?1)", nativeQuery = true) // sp para mysql
    List<Object[]> listarProcedure(Long id);
}
