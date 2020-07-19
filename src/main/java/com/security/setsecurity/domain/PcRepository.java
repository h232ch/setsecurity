package com.security.setsecurity.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PcRepository extends CrudRepository<Pc, Long> {

    List<Pc> findAll();
    Optional<Pc> findById(Long id);
    Pc save(Pc pc);
}
