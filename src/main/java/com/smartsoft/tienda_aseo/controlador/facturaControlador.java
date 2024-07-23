package com.smartsoft.tienda_aseo.controlador;
import com.smartsoft.tienda_aseo.modelos.factura;
import com.smartsoft.tienda_aseo.repository.facturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/facturas")
@RestController
public class facturaControlador {

    @Autowired
    private facturaRepository facturaRep;

    @GetMapping
    Iterable<factura> list(){
        return facturaRep.findAll();
    }

    @GetMapping("{num_factura}")
    public factura get(@PathVariable Integer id){
        return facturaRep.findById(id).orElse(null);
    };

    @PostMapping()
    public factura crear(@RequestBody factura user){
        return facturaRep.save(user);
    };

    @PutMapping("{num_factura}")
    public factura editar(@PathVariable Integer id, @RequestBody factura user){
        factura facturaDB=facturaRep.findById(id).orElse(null);

        facturaDB.setFecha(user.getFecha());

        return facturaRep.save(facturaDB);
    };

    @DeleteMapping("{num_factura}"
    )
    public void eliminar(@PathVariable Integer id){
        factura facturaDB=facturaRep.findById(id).orElse(null);
        facturaRep.delete(facturaDB);
    };

}
