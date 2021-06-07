package br.org.generation.BlogPessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.BlogPessoal.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

					// objeto do tipo optional é o nome da minha model usuario
					// valores podem vir nulos
	public Optional<UsuarioModel> findByUsuario(String usuario); // esse usuario é meu atributo 
	
	// >>> agora crio uma classe BasicSecurityConfig aqui no package repository
}
