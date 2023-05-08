
package com.portfoliomou.Mourelle.controlador;

import com.portfoliomou.Mourelle.entidad.Persona;
import com.portfoliomou.Mourelle.interfaz.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaControlador {
    @Autowired IPersonaServicio ipersonaServicio;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersona () {
        return ipersonaServicio.getPersona();              
    }
        
    @PostMapping ("/personas/crear")
    public String createPersona (@RequestBody Persona perso) {
        ipersonaServicio.savePersona(perso);
        return "El ususario fue creado";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        ipersonaServicio.deletePersona(id);
        return "El usuario fue eliminado";
    }
}
