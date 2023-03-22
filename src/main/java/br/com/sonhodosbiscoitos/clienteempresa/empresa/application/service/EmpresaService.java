package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import java.util.List;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaListResponse;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaResponse;

public interface EmpresaService {
	EmpresaResponse criaEmpresa(EmpresaRequest empresaRequest);
	List<EmpresaListResponse> buscaTodasEmpresas();
}
