package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import lombok.Value;

@Value
public class EmpresaDetalhadaResponse {
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
