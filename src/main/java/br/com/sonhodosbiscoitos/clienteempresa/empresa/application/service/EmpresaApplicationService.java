package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaDetalhadaResponse;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaListResponse;
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
	public EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start]EmpresaApplicationService criaEmpresa");
		Empresa empresa = empresaRepository.salva(new Empresa(empresaRequest));
		log.info("[finish]EmpresaApplicationService criaEmpresa");
		return EmpresaResponse.builder().idEmpresa(empresa.getIdEmpresa()).build();
	}

	@Override
	public List<EmpresaListResponse> buscaTodasEmpresas() {
		log.info("[start]EmpresaApplicationService buscaTodasEmpresas");
		List<Empresa> empresas = empresaRepository.buscaTodasEmpresas();
		log.info("[finish]EmpresaApplicationService buscaTodasEmpresas");
		return EmpresaListResponse.converte(empresas);
	}

	@Override
	public EmpresaDetalhadaResponse buscaTodasEmpresas(UUID idEmpresa) {
		log.info("[start]EmpresaApplicationService buscaTodasEmpresas");
		Empresa empresa = empresaRepository.buscaEmpresaAtravesId(idEmpresa);
		log.info("[finish]EmpresaApplicationService buscaTodasEmpresas");
		return new EmpresaDetalhadaResponse(empresa);
	}

	@Override
	public void deletaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[start]EmpresaApplicationService deletaEmpresaAtravesId");
		Empresa empresa = empresaRepository.buscaEmpresaAtravesId(idEmpresa);
		empresaRepository.deletaEmpresaAtravesId(empresa);
		log.info("[finish]EmpresaApplicationService deletaEmpresaAtravesId");
	}
}
