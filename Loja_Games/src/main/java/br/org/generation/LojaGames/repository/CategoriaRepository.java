package br.org.generation.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.LojaGames.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	public List<CategoriaModel> findAllByCategoriaContainingIgnoreCase (String categoria);

	public Object findAllByDescricaoContainingIgnoreCase(String descricao);
	
	
	
}
