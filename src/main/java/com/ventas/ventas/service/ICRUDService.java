package com.ventas.ventas.service;

import com.ventas.ventas.model.Cliente;

import java.util.List;
import java.util.Optional;

/**
 * @author freddyar
 */
public interface ICRUDService<T> {

    List<T> findAll();

    Optional<T> findById(Integer id);

    T create(T model);

    T update(T model);

    void delete(Integer id);
}
