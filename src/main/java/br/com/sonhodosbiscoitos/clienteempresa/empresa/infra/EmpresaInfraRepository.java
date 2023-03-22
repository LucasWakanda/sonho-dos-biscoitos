package br.com.sonhodosbiscoitos.clienteempresa.empresa.infra;

import org.springframework.stereotype.Repository;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository.EmpresaRepository;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EmpresaInfraRepository implements EmpresaRepository {

	private final EmpresaSpringDataJPARepository empresaSpringDataJPARepository;

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[start]EmpresaInfraRepository salva");
	    empresaSpringDataJPARepository.save(empresa);
		log.info("[finish]EmpresaInfraRepository salva");
		return empresa;
	}
}
