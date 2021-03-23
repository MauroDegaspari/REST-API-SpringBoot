package com.webservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.demo.model.Cliente;

@Repository // componente o tipo repositorio
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
