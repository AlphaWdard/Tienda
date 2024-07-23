package com.smartsoft.tienda_aseo.repository;

import com.smartsoft.tienda_aseo.modelos.producto;
import org.springframework.data.repository.CrudRepository;

//CrudRepository es una interfaz que proporciona metodos para acceder con mayor facilidad a la BD
public interface productoRepository extends CrudRepository<producto, Integer>
{


}
