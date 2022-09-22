package br.com.kaiosx.clientesapi.modelo;

import lombok.Data;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Usuario extends UserDetailsServiceAutoConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usuario;

    private String email;

    private String senha;

}
