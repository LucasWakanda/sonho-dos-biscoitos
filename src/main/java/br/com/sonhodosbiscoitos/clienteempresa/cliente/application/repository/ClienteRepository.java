package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.repository;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;

public interface ClienteRepository{
	Cliente salva(Cliente cliente);
}
