package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository;

import java.util.List;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;

public interface EmpresaRepository {
	Empresa salva(Empresa empresa);
	List<Empresa> buscaTodasEmpresas();
}
