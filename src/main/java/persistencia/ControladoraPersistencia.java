package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;


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

    public void borrarUsu(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsu(int id) {
       return usuJPA.findUsuario(id);
    }

    public void editarUsu(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
