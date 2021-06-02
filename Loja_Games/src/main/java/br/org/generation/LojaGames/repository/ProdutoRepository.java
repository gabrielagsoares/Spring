package br.org.generation.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.LojaGames.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

	public List<ProdutoModel> findAllByProdutoContainingIgnoreCase (String produto);

	
	
	
}
