package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import lombok.Value;
@Value
public class EmpresaListResponse {
	 
	private UUID idEmpresa;
	private String nomeEmpresa;
	private String nomeRepresentante;
	private String cnpj;
	private String cep;

	public EmpresaListResponse(Empresa empresa) {
		super();
		this.idEmpresa = empresa.getIdEmpresa();
		this.nomeEmpresa = empresa.getNomeEmpresa();
		this.nomeRepresentante = empresa.getNomeRepresentante();
		this.cnpj = empresa.getCnpj();
		this.cep = empresa.getCep();
	}

	public static List<EmpresaListResponse> converte(List<Empresa> empresas) {
		return empresas.stream().map(EmpresaListResponse::new).collect(Collectors.toList());
	}	
}
