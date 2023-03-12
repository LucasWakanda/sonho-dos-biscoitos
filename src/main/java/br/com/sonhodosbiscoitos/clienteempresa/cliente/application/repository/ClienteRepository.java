package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.repository;

import java.util.List;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteListResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;

public interface ClienteRepository{
	Cliente salva(Cliente cliente);
	List<ClienteListResponse> buscaTodosClientes();
}
