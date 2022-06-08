package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Aluno {

	@Id
	private Long Matricula;
	
	private String nome;
	
	public Aluno () {
		
	}

	public Aluno(Long matricula, String nome) {
		super();
		Matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return Matricula;
	}

	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
