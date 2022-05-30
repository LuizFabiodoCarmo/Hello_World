package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
   public String helloWorld	() {
	   return "Hello World, tudo nice!?";
   }

	@GetMapping("/bsm")
	public String bsm() {
		return "<h1> As BSM, mas, conhecidas também como, mentalidades  e habilidades "
				+ "da Generation são:"
				+ "<h1>Mentalidades:"
				+ "<h3>Orientação ao Futuro."
				+ "<h3>Responsabilidade Pessoal."
				+ "<h3> Metalidade de Crescimento."
				+ "<h3>Persistência."
				+ "<h1>Habilidades:"
				+ "<h3>Trabalho em Equipe."
				+ "<h3>Orientação ao Detalhe."
				+ "<h3>Proatividade."
				+ "<h3>Comunicação.";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "<h1>Meu objetivo:"
				+ "<h2>no bootcamp da Generation, eu estou respeitando meu tempo e"
				+ "sempre buscando dar meu melhor em cada momento, "
				+ "assim como esse HelloWorld aqui.";
				
	
	}
}


