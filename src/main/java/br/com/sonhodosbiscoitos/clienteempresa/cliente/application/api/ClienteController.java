package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
private final ClienteService clienteService;
	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
log.info("[Start] ClienteController postCliente");
ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
log.info("[finish]ClienteController postCliente");
		return clienteCriado;
	}
	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[start]  ClienteController getTodosClientes");
		log.info("[finish]  ClienteController getTodosClientes");
		return null;
	}

}
