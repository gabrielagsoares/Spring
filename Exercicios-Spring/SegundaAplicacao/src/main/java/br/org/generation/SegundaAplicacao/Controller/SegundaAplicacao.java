package br.org.generation.SegundaAplicacao.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SegundaAplicacao")

public class SegundaAplicacao {
	
	@GetMapping
	public String sayHabilidades() {
		return "Objetivos de aprendizagem: Persistência"
				+ ", orientação ao detalhe, mentalidade de crescimento!";
	}

}
