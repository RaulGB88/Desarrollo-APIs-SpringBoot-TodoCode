package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {

    //método para traer a todas las personas
    //lectura
    public List<Persona> getPersonas();

    //alta
    public void savePersona(Persona perso);

    //baja
    public void deletePersona(Long id);

    //lectura de un solo objeto
    public Persona findPersona(Long id);

    //edición/modificación
    public void editPersona(Long idOriginal, Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);

    public void editPersona(Persona per);
    
    
}
