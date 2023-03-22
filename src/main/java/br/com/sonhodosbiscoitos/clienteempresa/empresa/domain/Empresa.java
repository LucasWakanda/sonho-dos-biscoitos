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

import org.hibernate.validator.constraints.br.CNPJ;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api.EmpresaRequest;
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
	private String nomeRepresentante;
	@CNPJ
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

	public Empresa(EmpresaRequest empresaRequest) {
		this.nomeEmpresa = empresaRequest.getNomeEmpresa();
		this.nomeRepresentante = empresaRequest.getNomeRepresentante();
		this.email = empresaRequest.getEmail();
		this.telefone = empresaRequest.getTelefone();
		this.cep = empresaRequest.getCep();
		this.estado = empresaRequest.getEstado();
		this.cidade = empresaRequest.getCidade();
		this.bairro = empresaRequest.getBairro();
		this.rua = empresaRequest.getRua();
		this.numeroDaEmpresa = empresaRequest.getNumeroDaEmpresa();	}
}
