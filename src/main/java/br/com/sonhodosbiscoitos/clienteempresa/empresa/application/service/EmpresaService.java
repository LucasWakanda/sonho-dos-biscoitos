package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaAlteracaoRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaDetalhadaResponse;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaListResponse;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaResponse;

public interface EmpresaService {
	EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest);
	List<EmpresaListResponse> buscaTodasEmpresas();
	EmpresaDetalhadaResponse buscaTodasEmpresas(UUID idEmpresa);
	void deletaEmpresaAtravesId(UUID idEmpresa);
	void PatchAlteraPostCliente(UUID idEmpresa, @Valid EmpresaAlteracaoRequest empresaAlteracaoRequest);
}
