package persistencia;

import java.util.List;
import logica.Usuario;


public class ControladoraPersistencia {
    
    HorarioJpaController horaJPA;
    OdontologoJpaController odontoJPA;
    PacienteJpaController pacJPA;
    PersonaJpaController persJPA; //a este lo vamos a sacar porque no queremos persistir persona
    ResponsableJpaController resJPA;
    SecretarioJpaController secreJPA;
    TurnoJpaController turnJPA;
     UsuarioJpaController usuJPA;

    public ControladoraPersistencia() {
        
        usuJPA = new UsuarioJpaController();
        horaJPA = new HorarioJpaController();
        odontoJPA = new OdontologoJpaController();
        pacJPA = new PacienteJpaController();
        persJPA = new PersonaJpaController();
        resJPA = new ResponsableJpaController();
        secreJPA = new SecretarioJpaController();
        turnJPA = new TurnoJpaController();
      
    } 
     
    public void crearUsuario(Usuario usu){
        usuJPA.create(usu);
    
    }
    
    public List<Usuario> getUsuarios(){      
        return usuJPA.findUsuarioEntities();   
    }
}
