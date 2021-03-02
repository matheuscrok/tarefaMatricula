package com.crok.tarefaMatricula.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * @author CROK
 *@Entity= é utilizada para informar que uma classe também é uma entidade. ... Uma entidade representa, na Orientação a Objetos, 
 * uma tabela do banco de dados, e cada instância dessa entidade representa uma linha dessa tabela.
 */
@Entity
public class Curso {
	
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
	private String periodo;
	
	/**
	 * @ManyToOne= Esta anotação define uma associação com outra entidade que tenha a multiplicidade de muitos-para-um.
	 * @OneToMany = A anotação One-to-One é utilizada para associar 
	 * duas entidades onde uma não é componente da outra, ao contrário da definição acima.
	 * @JoinColumn(name ="curso_id") =  indica que a classe na qual você está utilizando-a é a dona ou o lado forte do relacionamento.
	 */
	@OneToMany
	private List<Turma> turmas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return periodo;
	}

	public void setTurno(String periodo) {
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}
	
 
	
	
	
	
	
}
