
package com.Biblioteca.EggClandestina.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalControlador {
    // Mapping al Index(Ruta Principal a mi web)
    @GetMapping("/")
    public String index(){
    return "index.html";
    }
}
