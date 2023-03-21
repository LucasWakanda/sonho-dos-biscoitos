package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class EmpresaApplicationService implements EmpresaService {

	@Override
	public EmpresaResponse criaEmpresa(@Valid EmpresaRequest empresaRequest) {
		log.info("[start]EmpresaApplicationService criaEmpresa");
		log.info("[finish]EmpresaApplicationService criaEmpresa");
		return null;
	}

}
