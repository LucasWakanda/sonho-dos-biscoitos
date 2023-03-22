package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class EmpresaController implements EmpresaAPI {
	private final EmpresaService empresaService;

	@Override
	public EmpresaResponse postEmpresa(@Valid EmpresaRequest empresaRequest) {
		log.info("[start]EmpresaController Empresa");
		EmpresaResponse empresaCriada = empresaService.criaEmpresa(empresaRequest);
		log.info("[finish]EmpresaController Empresa");
		return empresaCriada;
	}

	@Override
	public List<EmpresaListResponse> getTodasEmpresas() {
		log.info("[start]EmpresaController getTodasEmpresas");
		List<EmpresaListResponse> empresa = empresaService.buscaTodasEmpresas();
		log.info("[finish]EmpresaController getTodasEmpresas");
		return empresa;
	}

	@Override
	public EmpresaDetalhadaResponse getTodosEmpresaAtravesId(UUID idEmpresa) {
		log.info("[start]EmpresaController getTodosClienteAtravesId");
		log.info("[idEmpresa]{}", idEmpresa);
		EmpresaDetalhadaResponse empresaDetalhada = empresaService.buscaTodasEmpresas(idEmpresa);
		log.info("[finish]EmpresaController getTodosClienteAtravesId");
		return empresaDetalhada;
	}

	@Override
	public void deletaEmpresaAtravesId(UUID idEmpresa) {
		log.info("[start]EmpresaController deletaEmpresaAtravesId");
		log.info("[idEmpresa]{}", idEmpresa);
		empresaService.deletaEmpresaAtravesId(idEmpresa);
		log.info("[finish]EmpresaController deletaEmpresaAtravesId");
	}

	@Override
	public void PatchAlterapostEmpresa(UUID idEmpresa, @Valid EmpresaAlteracaoRequest empresaAlteracaoRequest) {
		log.info("[start]EmpresaController PatchAlterapostEmpresa");
		log.info("[idEmpresa]{}", idEmpresa);
		empresaService.PatchAlteraPostCliente(idEmpresa,empresaAlteracaoRequest);
		log.info("[finish]EmpresaController PatchAlterapostEmpresa");
	}
}
