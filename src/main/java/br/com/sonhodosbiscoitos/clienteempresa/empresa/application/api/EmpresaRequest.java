package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import lombok.Value;

@Value
public class EmpresaRequest {
	@NotBlank
	private String nomeEmpresa;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotNull
	private String telefone;
	@NotNull
	private String cep;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Estado estado;
	@NotBlank
	private String cidade;
	@NotBlank
	private String bairro;
	@NotBlank
	private String rua;
	@NotBlank
	private String numeroDaEmpresa;
}
