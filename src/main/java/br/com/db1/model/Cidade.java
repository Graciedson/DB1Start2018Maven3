package br.com.db1.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.loader.custom.Return;

@Entity(name = "cidade")
public class Cidade {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)	
	private Integer id;
	
	@Column(length = 50, nullable = false,insertable=true, updatable=false,name="nome")
	private String nome;

	@ManyToOne (cascade=CascadeType .ALL , fetch=FetchType .LAZY )
	@JoinColumn (name="uf_id")
	private Uf uf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}


}
