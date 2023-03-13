package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Estado;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.dataDeNascimento = cliente.getDataDeNascimento();
		this.sexo = cliente.getSexo();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
		this.cep = cliente.getCep();
		this.estado = cliente.getEstado();
		this.cidade = cliente.getCidade();
		this.bairro = cliente.getBairro();
		this.rua = cliente.getRua();
		this.numeroDaResidencia = cliente.getNumeroDaResidencia();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
		}
	
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
