package com.fiap.mecatronica.repository;
import com.fiap.mecatronica.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}