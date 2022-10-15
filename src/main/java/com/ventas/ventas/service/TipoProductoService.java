package com.ventas.ventas.service;

import com.ventas.ventas.model.TipoProducto;
import com.ventas.ventas.repository.ITipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoProductoService implements ICRUDService<TipoProducto> {

    @Autowired
    private ITipoProductoRepository tipoProductoRepo;

    @Override
    public TipoProducto create(TipoProducto tipoProducto) {
        return tipoProductoRepo.save(tipoProducto);
    }

    @Override
    public TipoProducto update(TipoProducto tipoProducto) {
        return tipoProductoRepo.save(tipoProducto);
    }

    @Override
    public Optional<TipoProducto> findById(Integer id) {
        return tipoProductoRepo.findById(id);
    }

    @Override
    public List<TipoProducto> findAll() {
        return tipoProductoRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        tipoProductoRepo.deleteById(id);
    }
}
