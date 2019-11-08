package br.com.usjt_pi_api_theplateisonthetable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt_pi_api_theplateisonthetable.model.repository.UsuarioRepository;;

@Service
public class UsuarioService {
	
		@Autowired
		UsuarioRepository usuarioRepo;
		
}
