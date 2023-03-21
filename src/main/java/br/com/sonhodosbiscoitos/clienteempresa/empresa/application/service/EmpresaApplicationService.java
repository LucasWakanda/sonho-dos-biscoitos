package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import org.springframework.stereotype.Service;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaResponse;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository.EmpresaRepository;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class EmpresaApplicationService implements EmpresaService {

	private final EmpresaRepository empresaRepository;

	@Override
	public EmpresaResponse criaEmpresa( EmpresaRequest empresaRequest) {
		log.info("[start]EmpresaApplicationService criaEmpresa");
		Empresa empresa = empresaRepository.salva(new Empresa(empresaRequest));
		log.info("[finish]EmpresaApplicationService criaEmpresa");
		return EmpresaResponse.builder().idEmpresa(empresa.getIdEmpresa()).build();
	}
}
