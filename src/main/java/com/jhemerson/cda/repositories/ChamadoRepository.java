package com.jhemerson.cda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhemerson.cda.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
