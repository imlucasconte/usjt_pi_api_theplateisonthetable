package br.com.usjt_pi_api_theplateisonthetable.controllers;


import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Usuario;
import br.com.usjt_pi_api_theplateisonthetable.model.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepo;

	
	@GetMapping ("/listar")
	public List <Usuario> obterUsuarios (){
		return 	usuarioRepo.findAll();
	}
	
	@PostMapping ("/salvar")
	//@ResponseStatus (HttpStatus.CREATED)
	public ResponseEntity<Usuario> salvar (@RequestBody Usuario usuario, 
								HttpServletResponse response) {
		System.out.println("passou aqui...");
		Usuario l = 	usuarioRepo.save(usuario);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().
				path("/{id}").
				buildAndExpand(l.getId()).toUri();
		//response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}
	
	@GetMapping ("/{id}")
	public Usuario obterLivro (@PathVariable Long id) {
		return usuarioRepo.findById(id).get();
	}

}
