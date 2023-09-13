package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {

	private String nomeCompleto;
	private String email;
	private String cpf;
	private UUID idCliente;
	private String cidade;

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream().map(ClienteListResponse::new).collect(Collectors.toList());
	}

	public ClienteListResponse(Cliente cliente) {
		this.cidade = cliente.getEndereco().getCidade();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();
		this.idCliente = cliente.getIdCliente();
	}
}
