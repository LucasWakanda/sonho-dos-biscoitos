package br.com.sonhodosbiscoitos.clienteempresa.empresa.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository.EmpresaRepository;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import br.com.sonhodosbiscoitos.clienteempresa.handler.APIException;
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
		try {
			empresaSpringDataJPARepository.save(empresa);
			} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados");
			}

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

	@Override
	public Empresa buscaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[start]EmpresaInfraRepository buscaEmpresaAtravesId");
		Empresa empresa = empresaSpringDataJPARepository.findById(idEmpresa)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Cliente não encontrado!"));
		log.info("[finish]EmpresaInfraRepository buscaEmpresaAtravesId");
		return empresa;
	}

	@Override
	public void deletaEmpresaAtravesId(Empresa empresa) {
		log.info("[start]EmpresaInfraRepository deletaEmpresaAtravesId");
		empresaSpringDataJPARepository.delete(empresa);
		log.info("[finish]EmpresaInfraRepository deletaEmpresaAtravesId");
	}
}
