package br.com.sonhodosbiscoitos.clienteempresa.empresa.domain;

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

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idEmpresa", updatable = false, unique = true, nullable = false)
	private UUID idEmpresa;
	@NotBlank
	private String nomeEmpresa;
	@NotBlank
	@Column(unique = true)
	private String cnpj;
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

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Empresa(UUID idEmpresa, @NotBlank String nomeEmpresa, @NotBlank @Email String email,
			@NotNull String telefone, @NotNull String cep, @NotNull Estado estado, @NotBlank String cidade,
			@NotBlank String bairro, @NotBlank String rua, @NotBlank String numeroDaEmpresa) {
		this.idEmpresa = idEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numeroDaEmpresa = numeroDaEmpresa;
	}
}
