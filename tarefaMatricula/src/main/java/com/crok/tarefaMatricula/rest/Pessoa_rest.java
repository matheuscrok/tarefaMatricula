package com.crok.tarefaMatricula.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.tarefaMatricula.dao.Pessoa_dao;
import com.crok.tarefaMatricula.entity.Pessoa;


/**
 * 
 * @author CROK
 *@RestController = é um controlador especial usado para serviços RESTFul e o equivalente a
 *@RequestMapping("/pessoa") = As anotações @Controller e @RequestMapping
Normalmente, a anotação de nível de classe mapeia um caminho de requisições específico em um controlador de formulário
 */
@RestController
@RequestMapping("/pessoa")
public class Pessoa_rest {
	
	/**
	 * @Autowired = fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter,
	 *  no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
	 * @GetMapping = metodo get que retorna elementos salvos no banco
	 * @PostMapping = metodo post salvo e edita o objeto
	 * @DeleteMapping("/{id}") = metodo delete onde passa o id do objeto entre as chaves
	 * @PathVariable = Em resumo, essa anotação vincula o espaço reservado do URI a um parâmetro de método dentro do método manipulador 
	 */
	
	@Autowired
	private Pessoa_dao pessoaDao;
	
	@GetMapping
	private List<Pessoa> get(){
		return pessoaDao.findAll();
	}
	
	@PostMapping
	private void post(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping("/{id}")
	private void delete(@PathVariable Long id) {
		pessoaDao.deleteById(id);
	}
	
	
	
	
}
