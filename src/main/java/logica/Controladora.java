package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario (String nombreUsuario, String password, String rol ) {
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setPassword(password);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    
    }
    
}
