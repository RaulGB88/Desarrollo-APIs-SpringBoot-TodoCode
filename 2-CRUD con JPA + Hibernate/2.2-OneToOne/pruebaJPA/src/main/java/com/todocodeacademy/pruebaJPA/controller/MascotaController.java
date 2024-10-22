package com.todocodeacademy.pruebaJPA.controller;
import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    
    @Autowired
    private IMascotaService mascoServ;
    
     @PostMapping ("/mascotas/crear")
    public String savePersona (@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);
        
        return "La mascota fue creada correctamente";
    }
    
    
}
