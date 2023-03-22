package br.com.sonhodosbiscoitos.clienteempresa.empresa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;

public interface EmpresaSpringDataJPARepository extends JpaRepository<Empresa, UUID>{
}
