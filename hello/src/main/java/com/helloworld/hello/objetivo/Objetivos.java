package com.helloworld.hello.objetivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class Objetivos {

	
	@GetMapping
	public String objetivos() {
		
		return    "Objetivos de aprendizagem: Busquei ao maximo absorver tudo sobre banco de dados e acredito que consegui !";
	}

}