package br.org.generation.BlogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.apache.commons.codec.binary.Base64;

import br.org.generation.BlogPessoal.model.UserLoginModel;
import br.org.generation.BlogPessoal.model.UsuarioModel;
import br.org.generation.BlogPessoal.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public UsuarioModel CadastrarUsuario (UsuarioModel usuario) {
		
		if(repository.findByUsuario(usuario.getUsuario()).isPresent()) {
			return null;
		}
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	String senhaEncoder = encoder.encode(usuario.getSenha());
	usuario.setSenha(senhaEncoder);
	
	return repository.save(usuario);
	
	}
	
	public Optional<UserLoginModel> Logar(Optional<UserLoginModel> user){
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<UsuarioModel> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodeAuth);
				
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());
				user.get().setSenha(usuario.get().getSenha());
				return user;
				
				
				
									
			}
		}
		
		return null;
	}
}
