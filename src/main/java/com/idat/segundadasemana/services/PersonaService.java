package com.idat.segundadasemana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idat.segundadasemana.dao.IPersonaDao;
import com.idat.segundadasemana.model.Persona;

@Service
public class PersonaService implements IPersonaService {
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

    @Override
    public boolean eliminar(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Persona buscar(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public List<Persona> listar() {
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Page<Persona> listarPagina(Pageable pagina) {
        throw new UnsupportedOperationException("Unimplemented method 'listarPagina'");
    }
    
}
