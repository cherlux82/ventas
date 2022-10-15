package com.ventas.ventas.service;

import com.ventas.ventas.model.DetalleVenta;
import com.ventas.ventas.repository.IDetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService implements ICRUDService<DetalleVenta> {

    @Autowired
    private IDetalleVentaRepository detalleVentaRepo;

    @Override
    public DetalleVenta create(DetalleVenta detalle) {
        return detalleVentaRepo.save(detalle);
    }

    @Override
    public DetalleVenta update(DetalleVenta detalle) {
        return detalleVentaRepo.save(detalle);
    }

    @Override
    public Optional<DetalleVenta> findById(Integer id) {
        return detalleVentaRepo.findById(id);
    }

    @Override
    public List<DetalleVenta> findAll() {
        return detalleVentaRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        detalleVentaRepo.deleteById(id);
    }
}
