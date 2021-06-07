package br.org.generation.BlogPessoal.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.generation.BlogPessoal.model.UsuarioModel;
import br.org.generation.BlogPessoal.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImplemen implements UserDetailsService{

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetailsImplemen loadUserByUsername(String userName) {
		Optional<UsuarioModel>user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found. "));
		
		return user.map(UserDetailsImplemen::new).get();
		
		
	}
}
