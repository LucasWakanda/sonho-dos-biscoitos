package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;

public interface EmpresaRepository {
	Empresa salva(Empresa empresa);
	List<Empresa> buscaTodasEmpresas();
	Empresa buscaEmpresaAtravesId(UUID idEmpresa);
	void deletaEmpresaAtravesId(Empresa empresa);	
}
