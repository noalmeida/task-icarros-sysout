package com.parameter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parametro")
public class ProcessaParametrosMensagem {
	
	@GetMapping("/{nome}/{idade}")
	public String mensagemParametros(@PathVariable String nome, @PathVariable String idade) {
		
		return "<h1><strong> Olá "+ nome  +" a sua idade é "+ idade + " anos. </strong></h2>";
	}

}
