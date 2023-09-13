package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Endereco;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	private Endereco endereco;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Sexo sexo;
	@CPF
	private String cpf;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String telefone;
	}
