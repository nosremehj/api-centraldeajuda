package com.jhemerson.cda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhemerson.cda.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
