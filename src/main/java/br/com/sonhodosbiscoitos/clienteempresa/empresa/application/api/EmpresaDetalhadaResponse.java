package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.domain.Empresa;
import lombok.Value;

@Value
public class EmpresaDetalhadaResponse {
	
	public EmpresaDetalhadaResponse(Empresa empresa) {
		this.idEmpresa = empresa.getIdEmpresa();
		this.nomeEmpresa = empresa.getNomeEmpresa();
		this.nomeRepresentante = empresa.getNomeRepresentante();
		this.cnpj = empresa.getCnpj();
		this.email = empresa.getEmail();
		this.telefone = empresa.getTelefone();
		this.cep = empresa.getCep();
		this.estado = empresa.getEstado();
		this.cidade = empresa.getCidade();
		this.bairro = empresa.getBairro();
		this.rua = empresa.getRua();
		this.numeroDaEmpresa = empresa.getNumeroDaEmpresa();
		this.dataHoraDoCadastro = empresa.getDataHoraDoCadastro();
	}
	private UUID idEmpresa;
	private String nomeEmpresa;
	private String nomeRepresentante;
	private String cnpj;
	private String email;
	private String telefone;
	private String cep;
	private Estado estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String numeroDaEmpresa;
	private LocalDateTime dataHoraDoCadastro;
}
