
package com.portfoliomou.Mourelle.repositorio;

import com.portfoliomou.Mourelle.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long>{
    
}
