package com.smartsoft.tienda_aseo.controlador;


import com.smartsoft.tienda_aseo.modelos.cliente;
import com.smartsoft.tienda_aseo.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/clientes") //Mapea las solicitudes HTTP relacionando metodos con URL's de las paginas
@RestController //Señala el controlador para los servicios RESTful
@CrossOrigin //Permite el acceso y servicio al Host de angular y springBoot
public class clienteControlador {

    @Autowired //Crea automaticamente dependencias.
    private clienteRepository clienteRep; //objeto Interface

    @GetMapping
    Iterable<cliente> list(){ //Metodo GET usado para señalar todos los objetos en una lista de la BD
        return clienteRep.findAll();
    }

    @GetMapping("{id}") //Metodo GET con un 'id' como parametro para hacer busqueda de solo un usuario
    public cliente get(@PathVariable Integer id)
    {
    return clienteRep.findById(id).orElse(null);
    };
    @DeleteMapping("{id}" //Metodo DELETE que usa como parametro un 'id' para encontrar el objeto y posteriormente elminarlo de la BD
    )
    public void eliminar(@PathVariable Integer id){
        cliente clienteDB=clienteRep.findById(id).orElse(null);
        clienteRep.delete(clienteDB);
    };


    @PostMapping() //Metodo POST usado para guardar un nuevo objeto en el listado (BD)
    public cliente crear(@RequestBody cliente user){
        return clienteRep.save(user);
    };

    @PutMapping("{id}") //Metodo PUT usa el parametro 'id' para señalar un objeto y reescribir las variables de un objeto y guardarlo en el listado (BD)
    public cliente editar(@PathVariable Integer id, @RequestBody cliente user){
        cliente clienteDB=clienteRep.findById(id).orElse(null);

        clienteDB.setNombre(user.getNombre());
        clienteDB.setApellido(user.getApellido());
        clienteDB.setTelefono(user.getTelefono());
        clienteDB.setEmail(user.getEmail());
        clienteDB.setDireccion(user.getDireccion());
        clienteDB.setFecha_nacimiento(user.getFecha_nacimiento());

        return clienteRep.save(clienteDB);
    };


}
