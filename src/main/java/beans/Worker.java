package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "worker")

public class Worker {
	
	@Id
	@Column(name = "id_worker")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_worker;
	private String nome;
	private String cognome;
	private int eta;
	
	public Worker() {
		
	}

	public Long getId_worker() {
		return id_worker;
	}

	public void setId_worker(Long id_worker) {
		this.id_worker = id_worker;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
}
