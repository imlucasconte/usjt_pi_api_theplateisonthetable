package br.com.usjt_pi_api_theplateisonthetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Cardapio;
import br.com.usjt_pi_api_theplateisonthetable.model.repository.CardapioRepository;
import br.com.usjt_pi_api_theplateisonthetable.model.repository.UsuarioRepository;

@Service
public class CardapioService {

	@Autowired
	CardapioRepository cardapioRepository;

	@Autowired
	UsuarioRepository userRepository;

	public List<Cardapio> findAllCardapio() {
		try {
			return cardapioRepository.findAll();
		} catch (Exception e) {
			throw e;
		}
	}
}
