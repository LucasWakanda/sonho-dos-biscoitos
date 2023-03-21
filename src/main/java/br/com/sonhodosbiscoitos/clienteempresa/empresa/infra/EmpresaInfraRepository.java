package br.com.sonhodosbiscoitos.clienteempresa.empresa.infra;

import org.springframework.stereotype.Repository;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository.EmpresaRepository;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class EmpresaInfraRepository implements EmpresaRepository {

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[start]EmpresaInfraRepository salva");
		log.info("[finish]EmpresaInfraRepository salva");
		return empresa;
	}

}
