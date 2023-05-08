
package com.portfoliomou.Mourelle.interfaz;

import com.portfoliomou.Mourelle.entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    
    //mostrar
    public List<Persona> getPersona();
    
    //guardar o midiicar
    public void savePersona (Persona perso);
    
    //Buscar por ID
    public Persona findPersona (Long id);
    
    //Eliminar por ID
    public void deletePersona (Long id);
}
