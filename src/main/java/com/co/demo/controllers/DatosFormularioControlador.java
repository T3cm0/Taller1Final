package com.co.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.demo.entity.DatosFormulario;
import com.co.demo.service.IDatosFormulario;
import com.co.demo.service.ImDatosFormularioService;

@Controller
@RestController
@RequestMapping("/bftaller1")
public class DatosFormularioControlador {

    private ImDatosFormularioService datosFormularioService;

    @Autowired
    public DatosFormularioControlador(ImDatosFormularioService datosFormularioService) {
        this.datosFormularioService = datosFormularioService;
    }

    @GetMapping("/")
    public String crear(Model model) {
        DatosFormulario datosFormulario = new DatosFormulario();
        model.addAttribute("datosFormulario", datosFormulario);
        return "redirect:/index"; // Cambia esto al nombre correcto de tu vista de formulario
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute DatosFormulario datosFormulario) {
        datosFormularioService.guardar(datosFormulario); 
        return "redirect:/band";
    }
    
}