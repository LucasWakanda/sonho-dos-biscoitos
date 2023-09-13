
package br.com.sonhodosbiscoitos.clienteempresa.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteAlteracaoRequest;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)	
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	 @Embedded
	private Endereco endereco;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotNull
	private String telefone;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(@Valid ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.sexo = clienteRequest.getSexo();
		this.cpf = clienteRequest.getCpf();
		this.email = clienteRequest.getEmail();
		this.telefone = clienteRequest.getTelefone();
	    this.endereco = clienteRequest.getEndereco();
		this.dataHoraDoCadastro = LocalDateTime.now();	}

	public void altera(@Valid ClienteAlteracaoRequest clienteAlteracaoRequest) {
		this.endereco = clienteAlteracaoRequest.getEndereco();
		this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
		this.dataDeNascimento = clienteAlteracaoRequest.getDataDeNascimento();
		this.sexo = clienteAlteracaoRequest.getSexo();
		this.telefone = clienteAlteracaoRequest.getTelefone();
		this.dataHoraDoCadastro = LocalDateTime.now();	}

	}
