package br.com.sonhodosbiscoitos.clienteempresa.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.repository.ClienteRepository;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[start]ClienteInfraRepository salva");
		log.info("[finish]ClienteInfraRepository salva");
		return cliente;
	}

}
