package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteAlteracaoRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteDetalhadoResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteListResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void PatchAlteraPostCliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);
}
