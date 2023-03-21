package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class EmpresaController implements EmpresaAPI {

	@Override
	public EmpresaRespoonse postEmpresa(@Valid EmpresaRequest EmpresaRequest) {
		log.info("[start]EmpresaController Empresa");
		log.info("[finish]EmpresaController Empresa");
		return null;
	}

}
