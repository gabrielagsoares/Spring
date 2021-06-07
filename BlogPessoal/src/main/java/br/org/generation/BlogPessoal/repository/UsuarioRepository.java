package br.org.generation.BlogPessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.BlogPessoal.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

					// objeto do tipo optional é o nome da minha model usuario
					// valores podem vir nulos
	public Optional<UsuarioModel> findByUsuario(String usuario); // esse usuario é meu atributo 
	
	// >>> classe BasicSecurityConfig aqui no package repository
}
