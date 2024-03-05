package com.co.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.demo.entity.DatosFormulario;
import com.co.demo.repository.DatosFormularioRepository;

@Service
public class ImDatosFormularioService implements IDatosFormulario {

    private final DatosFormularioRepository datosFormularioRepository;
    
    @Autowired
    public ImDatosFormularioService(DatosFormularioRepository datosFormularioRepository) {
        this.datosFormularioRepository = datosFormularioRepository;
    }

    @Override
    public void guardar(DatosFormulario datosFormulario) {
        datosFormularioRepository.save(datosFormulario);
    }
}
