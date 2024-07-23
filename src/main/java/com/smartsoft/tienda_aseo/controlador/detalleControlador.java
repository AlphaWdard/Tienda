package com.smartsoft.tienda_aseo.controlador;

import com.smartsoft.tienda_aseo.modelos.detalle;
import com.smartsoft.tienda_aseo.repository.detalleRepository;
import org.springframework.web.bind.annotation.*;

public class detalleControlador {

    private detalleRepository detalleRep;

    @GetMapping
    Iterable<detalle> list(){
        return detalleRep.findAll();
    }

    @GetMapping("{id}")
    public detalle get(@PathVariable Integer id){
        return detalleRep.findById(id).orElse(null);
    };

    @PostMapping()
    public detalle crear(@RequestBody detalle user){
        return detalleRep.save(user);
    };

    @PutMapping("{id}")
    public detalle editar(@PathVariable Integer id, @RequestBody detalle user){
        detalle detalleDB=detalleRep.findById(id).orElse(null);

        detalleDB.setPrecio(user.getPrecio());
        detalleDB.setCantidad(user.getCantidad());



        return detalleRep.save(detalleDB);
    };

    @DeleteMapping("{id}"
    )
    public void eliminar(@PathVariable Integer id){
        detalle detalleDB=detalleRep.findById(id).orElse(null);
        detalleRep.delete(detalleDB);
    };
}
