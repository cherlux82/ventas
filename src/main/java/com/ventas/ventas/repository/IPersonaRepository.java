package com.ventas.ventas.repository;

import com.ventas.ventas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author freddyar
 */
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
}
