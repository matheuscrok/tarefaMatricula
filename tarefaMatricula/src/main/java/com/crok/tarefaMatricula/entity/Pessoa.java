package com.crok.tarefaMatricula.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author CROK
 *@Entity= é utilizada para informar que uma classe também é uma entidade. ... Uma entidade representa, na Orientação a Objetos, 
 * uma tabela do banco de dados, e cada instância dessa entidade representa uma linha dessa tabela.
 */
@Entity
public class Pessoa {
	
	/**
	 * @Id = utilizada para informar ao JPA qual campo/atributo de uma entidade 
	 * estará relacionado à chave primária da respectiva tabela no banco de dados. 
	 * @GeneratedValue = faz parte do pacote javax. persistence. Neste caso, o identificador
	 *  único será gerado pela coluna de auto incremento do banco de dados.
	 * (strategy = GenerationType.IDENTITY) =  a implementação da especificação escolherá uma estratégia para geração dos ids.
	 * @Column = é usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.
	 * (nullable = false) = é a maneira JPA de declarar uma coluna como não nula
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cpf;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}
	
	
}
