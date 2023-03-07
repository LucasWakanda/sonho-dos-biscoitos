package br.com.sonhodosbiscoitos.clienteempresa.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)	
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Sexo sexo;
	@CPF
	private String cpf;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private int Telefone;
	@NotBlank
	private int cep;
	@NotNull
	private Estado estado;
	@NotBlank
	private String cidade;
	@NotBlank
	private String bairro;
	@NotBlank
	private String rua;
	@NotBlank
	private String numeroDaResidencia;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(@NotBlank String nomeCompleto, @NotBlank @NotNull LocalDate dataDeNascimento, @NotNull Sexo sexo,
			@CPF String cpf, @NotBlank @Email String email, @NotBlank int telefone, @NotBlank int cep,
			@NotNull Estado estado, @NotBlank String cidade, @NotBlank String bairro, @NotBlank String rua,
			@NotBlank String numeroDaResidencia) {
		this.nomeCompleto = nomeCompleto;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		Telefone = telefone;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numeroDaResidencia = numeroDaResidencia;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
