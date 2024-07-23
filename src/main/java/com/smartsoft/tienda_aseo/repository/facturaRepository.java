package com.smartsoft.tienda_aseo.repository;

import com.smartsoft.tienda_aseo.modelos.cliente;
import com.smartsoft.tienda_aseo.modelos.factura;
import org.springframework.data.repository.CrudRepository;

public interface facturaRepository extends CrudRepository<factura, Integer> {
}
