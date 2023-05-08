
package com.portfoliomou.Mourelle.servicio;

import com.portfoliomou.Mourelle.entidad.Persona;
import com.portfoliomou.Mourelle.interfaz.IPersonaServicio;
import com.portfoliomou.Mourelle.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersoServ implements IPersonaServicio{
    @Autowired IPersonaRepositorio ipersonaRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona  = ipersonaRepo.findAll();
        return persona;
        
    }

    @Override
    public void savePersona(Persona perso) {
        ipersonaRepo.save(perso);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepo.deleteById(id);
    }
    
}
