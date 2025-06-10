package com.tads.pw.prova2.Repository;

import com.tads.pw.prova2.Entitys.Camisa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CamisaRepository extends JpaRepository<Camisa, Long> {
    List<Camisa> findByIsDeletedIsNull();
}
