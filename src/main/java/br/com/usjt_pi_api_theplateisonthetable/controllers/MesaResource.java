package br.com.usjt_pi_api_theplateisonthetable.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesa")
public class MesaResource {

	@GetMapping("/mostrar")
		public String mesa() {
			return "mesa";
		}
	}

