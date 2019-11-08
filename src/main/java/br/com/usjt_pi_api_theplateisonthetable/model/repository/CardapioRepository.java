package br.com.usjt_pi_api_theplateisonthetable.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Cardapio;

/**
 * @author luc_c
 *
 */
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {
	
}
