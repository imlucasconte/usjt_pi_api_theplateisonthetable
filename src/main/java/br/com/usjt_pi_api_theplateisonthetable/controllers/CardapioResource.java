package br.com.usjt_pi_api_theplateisonthetable.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.usjt_pi_api_theplateisonthetable.model.beans.Cardapio;
import br.com.usjt_pi_api_theplateisonthetable.model.repository.CardapioRepository;

@RestController
@RequestMapping("/cardapio")
public class CardapioResource {

	@Autowired
	private CardapioRepository cardapioRepo;

	@GetMapping("/")
	public @ResponseBody List<Cardapio> obterCardapios() {
		try {
			return cardapioRepo.findAll();
		} catch (Exception e) {
			throw e;
		}
	}

}
