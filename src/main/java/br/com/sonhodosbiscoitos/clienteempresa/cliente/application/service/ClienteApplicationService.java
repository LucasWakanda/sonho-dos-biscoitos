package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteDetalhadoResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteListResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteResponse;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.repository.ClienteRepository;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[start]ClienteApplicationService criaCliente ");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish]ClienteApplicationService criaCliente ");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[start]ClienteResponse buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finish]ClienteResponse buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[start]ClienteApplicationService buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[finish]ClienteApplicationService buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}
}