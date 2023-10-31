package com.itb.relacionamentos.relacionamentosinf2gm.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.relacionamentos.relacionamentosinf2gm.model.entity.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
