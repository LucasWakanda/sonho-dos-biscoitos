package br.com.sonhodosbiscoitos.cadastrocomercio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CadastroComercioApplication {
  
	@GetMapping 
	public String getHomeTeste() {
		return "Cadastro comercio";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroComercioApplication.class, args);
	}
}
