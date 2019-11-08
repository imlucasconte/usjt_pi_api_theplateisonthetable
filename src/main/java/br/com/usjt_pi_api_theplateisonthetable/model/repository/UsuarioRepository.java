package br.com.usjt_pi_api_theplateisonthetable.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{
	
	// findByID
		
	@Autowired(required=true)
	public Usuario findByEmailAndPassword(String email, String password);
	
}
