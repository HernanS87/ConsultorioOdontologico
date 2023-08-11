package persistencia;


public class ControladoraPersistencia {
    
     HorarioJpaController horaJPA = new HorarioJpaController();
     OdontologoJpaController odontoJPA = new OdontologoJpaController();
     PacienteJpaController pacJPA = new PacienteJpaController();
     PersonaJpaController persJPA = new PersonaJpaController(); //a este lo vamos a sacar porque no queremos persistir persona
     ResponsableJpaController resJPA = new ResponsableJpaController();
     SecretarioJpaController secreJPA = new SecretarioJpaController();
     TurnoJpaController turnJPA = new TurnoJpaController();
     UsuarioJpaController usuJPA = new UsuarioJpaController();
     
    
}
