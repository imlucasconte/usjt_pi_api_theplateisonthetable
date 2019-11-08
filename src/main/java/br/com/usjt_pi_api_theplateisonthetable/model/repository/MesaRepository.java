package br.com.usjt_pi_api_theplateisonthetable.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Mesa;

public interface MesaRepository extends JpaRepository <Mesa, Long>{
	
}
