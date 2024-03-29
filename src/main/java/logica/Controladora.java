package logica;

import java.util.ArrayList;
import java.util.List;
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
    
    public List<Usuario> getUsuarios(){       
        return controlPersis.getUsuarios();  
    }

    public void borrarUsu(int id) {
        controlPersis.borrarUsu(id);
    }

    public Usuario traerUsu(int id) {
        return controlPersis.traerUsu(id);
    }

    public void editarUsu(Usuario usu) {
        controlPersis.editarUsu(usu);
    }

    public boolean comprobarIngreso(String usuario, String pass) {
        
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){ 
                if(usu.getPassword().equals(pass)){ 
                    ingreso = true;
                }
            }
        }     
        return ingreso;       
    }
    
}
