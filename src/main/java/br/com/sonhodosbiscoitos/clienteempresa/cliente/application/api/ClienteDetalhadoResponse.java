package br.com.sonhodosbiscoitos.clienteempresa.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Cliente;
import br.com.sonhodosbiscoitos.clienteempresa.cliente.domain.Endereco;
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
	private LocalDateTime dataHoraDoCadastro;
	private Endereco endereco;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.endereco = cliente.getEndereco();
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.dataDeNascimento = cliente.getDataDeNascimento();
		this.sexo = cliente.getSexo();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
