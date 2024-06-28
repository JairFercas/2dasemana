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

    Persona buscar(Long id); //si quiere ver solo una Persona, solo "Persona"

    List<Persona> listar(); //Si quiero ver varias personas List<Persona>

    Page<Persona> listarPagina(Pageable pagina);

    //agreados recientemente, metodos especiales con HQL y Query Native
    List<Persona> listarNombreApellidos(String nombres, String apellidos);
    List<Persona> listarHQL(Long id);
    List<Persona> listarNativo();
    List<Persona> listarProcedure(Long id);

    List<Persona> registrarPersonas(List<Persona> pRegistradas);


}
