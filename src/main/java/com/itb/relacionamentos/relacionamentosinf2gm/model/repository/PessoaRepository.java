package com.itb.relacionamentos.relacionamentosinf2gm.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.relacionamentos.relacionamentosinf2gm.model.entity.Pessoa;

// obs: o JpaRepository contém vários métodos de 'crud', pelo menos os mais básicos.
//      após a extensão, todos esses métodos são 'transferidos' para nossa interface.
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}