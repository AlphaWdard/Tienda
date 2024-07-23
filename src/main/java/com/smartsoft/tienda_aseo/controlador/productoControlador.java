package com.smartsoft.tienda_aseo.controlador;

import com.smartsoft.tienda_aseo.modelos.cliente;
import com.smartsoft.tienda_aseo.modelos.producto;
import com.smartsoft.tienda_aseo.repository.clienteRepository;
import com.smartsoft.tienda_aseo.repository.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/productos")
@RestController
public class productoControlador {

    private productoRepository productoRep;

    @GetMapping
    Iterable<producto> list(){
        return productoRep.findAll();
    }

    @GetMapping("{id}")
    public producto get(@PathVariable Integer id){
        return productoRep.findById(id).orElse(null);
    };

    @PostMapping()
    public producto crear(@RequestBody producto user){
        return productoRep.save(user);
    };

    @PutMapping("{id}")
    public producto editar(@PathVariable Integer id, @RequestBody producto user){
        producto productoDB=productoRep.findById(id).orElse(null);

        productoDB.setNombre(user.getNombre());
        productoDB.setPrecio(user.getPrecio());
        productoDB.setStock(user.getStock());

        return productoRep.save(productoDB);
    };

    @DeleteMapping("{id}"
    )
    public void eliminar(@PathVariable Integer id){
        producto productoDB=productoRep.findById(id).orElse(null);
        productoRep.delete(productoDB);
    };

}
