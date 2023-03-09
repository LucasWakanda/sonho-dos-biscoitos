package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
log.info("[start]ClienteApplicationService criaCliente ");
log.info("[finish]ClienteApplicationService criaCliente ");
return null;
	}

}
