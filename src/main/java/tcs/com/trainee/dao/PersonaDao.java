package tcs.com.trainee.dao;

import org.springframework.data.repository.CrudRepository;
import tcs.com.trainee.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{
     
    
}
