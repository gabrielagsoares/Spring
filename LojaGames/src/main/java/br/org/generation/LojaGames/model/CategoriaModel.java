package br.org.generation.LojaGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categorias")


public class CategoriaModel {
	
    @Id	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
   @NotNull
   @Size(min = 5, max = 100)
	private String categorias;
   
   @NotNull
   @Size(min=5, max = 100)
	private String nome;
	
   public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@NotNull
   @Size(min=5, max = 100)
	private String descricao;
   
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
