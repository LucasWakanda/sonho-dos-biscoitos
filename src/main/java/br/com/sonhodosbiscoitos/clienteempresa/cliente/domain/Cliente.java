package br.com.sonhodosbiscoitos.clienteempresa.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

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
	@CPF
	@Column(unique = true)
	private String cpf;
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
	@NotNull
	private String rua;
	@NotNull
	private String numeroDaResidencia;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(@NotBlank String nomeCompleto, @NotNull LocalDate dataDeNascimento, @NotNull Sexo sexo,
			@CPF String cpf, @NotNull @Email String email, @NotNull String telefone, @NotNull String cep,
			@NotNull Estado estado, @NotNull String cidade, @NotNull String bairro, @NotNull String rua,
			@NotNull String numeroDaResidencia) {
		this.nomeCompleto = nomeCompleto;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numeroDaResidencia = numeroDaResidencia;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}