package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private LocalDate dataDeNascimento;
	private Sexo sexo;
	private String cpf;
	private String email;
	private String telefone;
	private String cep;
	private Estado estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String numeroDaResidencia;
	private LocalDateTime dataHoraDoCadastro;
}
