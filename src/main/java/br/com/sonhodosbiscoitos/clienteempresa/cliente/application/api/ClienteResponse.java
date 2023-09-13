package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteResponse {
	
	public ClienteResponse(Cliente cliente) {
this.idCliente = cliente.getIdCliente();
	}

	private UUID idCliente;
}
