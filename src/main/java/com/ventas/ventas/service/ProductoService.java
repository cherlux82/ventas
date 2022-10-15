package com.ventas.ventas.service;

import com.ventas.ventas.model.Producto;
import com.ventas.ventas.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements ICRUDService<Producto> {

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public Producto create(Producto cliente) {
        return productoRepo.save(cliente);
    }

    @Override
    public Producto update(Producto cliente) {
        return productoRepo.save(cliente);
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return productoRepo.findById(id);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        productoRepo.deleteById(id);
    }
}
