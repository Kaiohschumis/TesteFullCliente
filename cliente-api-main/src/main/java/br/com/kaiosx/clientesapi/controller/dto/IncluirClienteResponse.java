package br.com.kaiosx.clientesapi.controller.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Lob;
import java.time.Instant;

@Data
public class IncluirClienteResponse {

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
