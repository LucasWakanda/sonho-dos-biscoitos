package br.com.sonhodosbiscoitos.clienteempresa.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.repository.ClienteRepository;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import br.com.sonhodosbiscoitos.clienteempresa.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[start]ClienteInfraRepository salva");
		try {
			clienteSpringDataJPARepository.save(cliente);
			} catch (DataIntegrityViolationException e) {
				throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados");
			}		log.info("[finish]ClienteInfraRepository salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[start]ClienteInfraRepository buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finish]ClienteInfraRepository buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesId(UUID idCliente) {
		log.info("[start]ClienteInfraRepository buscaClienteAtravesId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Cliente não encontrado!"));
		log.info("[finish]ClienteInfraRepository buscaClienteAtravesId");
		return cliente;
	}

	@Override
	public void deletaCliente(Cliente cliente) {
		log.info("[start]ClienteInfraRepository deletaCliente");
		clienteSpringDataJPARepository.delete(cliente);
		log.info("[finish]ClienteInfraRepository deletaCliente");
	} 
}