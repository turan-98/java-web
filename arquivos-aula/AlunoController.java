package com.fatec.scel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.scel.model.Livro;

public class AlunoController {
	@GetMapping("/home") // Define a url que quando for requisitada chamara o metodo
	public String home() {
		// Retorna a view que deve ser chamada, neste exemplo a pagina home (html)
		return "home";

	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastraLivro(Livro aluno) {
		ModelAndView mv = new ModelAndView("cadastrarAluno");
		mv.addObject("livro", aluno);
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView adicionar(Livro aluno) {
		System.out.println("ISBN digitado na interface ===>" + aluno.getIsbn());
		ModelAndView modelAndView = new ModelAndView("consultarLivro");
		modelAndView.addObject("message", aluno.getIsbn());
		return modelAndView;
	}
}
