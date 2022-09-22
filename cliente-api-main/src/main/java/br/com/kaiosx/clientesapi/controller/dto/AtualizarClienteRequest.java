package br.com.kaiosx.clientesapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AtualizarClienteRequest {
    private Long id;
    private String cpf;
    private String nome;
    private String cep;
    private String endereco;
    private String numero;
    private String bairro;
    private String complemento;
    private String municipio;
    private String uf;
    private String rg;
    private String email;
    private byte[] foto;
}
