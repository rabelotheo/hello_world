package com.helloworld.hello.listabsm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listabsm")

public class ListaBsm {
	
	@GetMapping
	public String listaBsm() {
		
		return    "--> Mentalidades <--\n"
				+ "     ⇘⇘     ⇙⇙\n"
				+ "  Orientação ao Futuro\r\n"
				+ "  Responsabilidade Pessoal\r\n"
				+ "  Mentalidade de Crescimento\r\n"
				+ "  Persistência\r\n\n"
				+ "--> Habilidades <--\r\n"
				+ "    ⇘⇘      ⇙⇙\n"
				+ "  Trabalho em Equipe\r\n"
				+ "  Atenção aos Detalhes\r\n"
				+ "  Proatividade\r\n"
				+ "  Comunicação";
	}

}
