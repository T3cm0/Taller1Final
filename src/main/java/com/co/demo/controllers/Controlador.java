package com.co.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/bftaller1")
public class Controlador {
    @GetMapping("/band")
	public String band() {
		return "band";
	}
	@GetMapping("/music")
	public String music() {
		return "music";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/contactenos")
	public String contactenos() {
		return "contactenos";
	}
	@GetMapping("/nosotros")
	public String nosotros() {
		return "nosotros";
	}
	
}
