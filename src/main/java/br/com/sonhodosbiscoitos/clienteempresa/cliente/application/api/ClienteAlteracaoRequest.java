package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Endereco;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Sexo;
import lombok.Value;
@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Sexo sexo;
	@NotNull
	private String telefone;
	@NotNull
	@Embedded
	private Endereco endereco;
}
