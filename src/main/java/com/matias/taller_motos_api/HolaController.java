package com.matias.taller_motos_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/hola")
    public String hola() {
        return "Bienvenido al taller de Matias";
    }

    @GetMapping("/taller")
    public String taller() {
        return "Este es el taller de Matias y su horario es de lunes a viernes de 9hs a 18hs" +
                " y los sábados de 11hs a 13hs";
    }
}
