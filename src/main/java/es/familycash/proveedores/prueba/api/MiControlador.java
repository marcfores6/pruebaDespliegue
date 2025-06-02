package es.familycash.proveedores.prueba.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MiControlador {

    @GetMapping("/hola")
    public String hola() {
        return "¡Hola desde el backend!";
    }

    @GetMapping("/info")
    public String info() {
        return "Este es el backend desplegado con Spring Boot.";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludo(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}