package br.com.sonhodosbiscoitos.clienteempresa.empresa.infra;

import java.util.List;

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

	@Override
	public List<Empresa> buscaTodasEmpresas() {
		log.info("[start]EmpresaInfraRepository buscaTodasEmpresas");
		List<Empresa> todasempresas = empresaSpringDataJPARepository.findAll();
		log.info("[finish]EmpresaInfraRepository buscaTodasEmpresas");
		return todasempresas;
	}
}
