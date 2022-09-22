package br.com.kaiosx.clientesapi.dao;

import br.com.kaiosx.clientesapi.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAll();
}
