package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.service;

import javax.validation.Valid;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
}
