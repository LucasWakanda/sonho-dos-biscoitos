package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.service;

import javax.validation.Valid;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaResponse;

public interface EmpresaService {
	EmpresaResponse criaEmpresa(@Valid EmpresaRequest empresaRequest);
}
