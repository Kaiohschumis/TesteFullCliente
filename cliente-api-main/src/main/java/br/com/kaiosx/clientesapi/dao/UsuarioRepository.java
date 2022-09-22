package br.com.kaiosx.clientesapi.dao;

import br.com.kaiosx.clientesapi.modelo.Cliente;
import br.com.kaiosx.clientesapi.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Cliente, Long> {

    Usuario findByLogin(String usuario);
}
