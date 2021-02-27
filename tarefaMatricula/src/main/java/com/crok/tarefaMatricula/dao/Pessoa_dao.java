package com.crok.tarefaMatricula.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.tarefaMatricula.entity.Pessoa;
/**
 * 
 * @author CROK
 *@Repository = anotação que serve para definir uma classe como pertencente à camada de persistência.
 */
@Repository
public interface Pessoa_dao extends JpaRepository<Pessoa, Long>{

}
