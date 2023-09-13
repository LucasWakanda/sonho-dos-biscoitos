package br.com.sonhodosbiscoitos.clienteempresa.cliente.domain;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Getter
@Embeddable

public class Endereco {
	@NotNull
	private String cep;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Estado estado;
	@NotBlank
	private String cidade;
	@NotBlank
	private String bairro;
	@NotNull
	private String rua;
	@NotNull
    private String numeroDaResidencia;
}
