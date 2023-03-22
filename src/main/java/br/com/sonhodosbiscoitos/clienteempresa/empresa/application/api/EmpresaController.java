package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.List;

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
		log.info("[start]EmpresaController getTodasEmpresas");
		return null;
	}

}
