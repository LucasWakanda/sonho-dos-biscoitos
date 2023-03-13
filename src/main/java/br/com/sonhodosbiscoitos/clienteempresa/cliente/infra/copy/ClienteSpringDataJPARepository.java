package br.com.sonhodosbiscoitos.clienteempresa.cliente.infra.copy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{	
}
