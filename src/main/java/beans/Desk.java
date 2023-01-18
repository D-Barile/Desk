package beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "desk")
public class Desk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_desk;
	private String nome;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "desk")
	private Worker worker;

	
	public Desk() {
		
	}

	public Long getId_desk() {
		return id_desk;
	}

	public void setId_desk(Long id_desk) {
		this.id_desk = id_desk;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return "Scrivania n." + id_desk;
	}
	
}

