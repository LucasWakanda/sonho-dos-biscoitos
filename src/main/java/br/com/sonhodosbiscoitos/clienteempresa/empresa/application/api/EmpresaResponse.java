package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EmpresaResponse {
	private UUID idEmpresa;
}
