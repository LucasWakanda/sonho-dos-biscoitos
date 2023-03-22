package br.com.sonhodosbiscoitos.clienteempresa.empresa.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/empresa")
public interface EmpresaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EmpresaResponse postEmpresa(@Valid @RequestBody EmpresaRequest empresaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
List<EmpresaListResponse> getTodasEmpresas();
	
	@GetMapping (value = "/{idEmpresa}")
	@ResponseStatus(code = HttpStatus.OK)
	EmpresaDetalhadaResponse getTodosEmpresaAtravesId(@PathVariable UUID idEmpresa);
}
