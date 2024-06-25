package com.idat.segundadasemana.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idat.segundadasemana.dao.IPersonaDao;
import com.idat.segundadasemana.model.Persona;

@Service
// -> Pasa a .....
public class PersonaService implements IPersonaService { //3) se implementan las interfaces creadas en este servicio del modelo -> controlador de servicios
    //AQUI ESTA LA LOGICA DE QUE HACE CADA METODO, SE PODRIA DECIR QUE ESTA PARTE ES LA MAS COMPLICADA
    @Autowired
    private IPersonaDao dao;

    @Override
    public Persona registrar(Persona p) {
        p.setIdPersona(0L);
        return dao.save(p);
    }

    @Override
    public Persona modificar(Persona p) {
        return dao.save(p);
    }

    @SuppressWarnings("unused")
    @Override
    public boolean eliminar(Long id) {
        Optional<Persona> opt= dao.findById(id);
        if (opt!=null) {
            dao.delete(opt.get());
            return true;
        }
        return false;
    }

    @Override
    public Persona buscar(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Persona> listar() {
        return dao.findAll();
    }

    @Override
    public Page<Persona> listarPagina(Pageable pagina) {
        return dao.findAll(pagina);
    }
}
