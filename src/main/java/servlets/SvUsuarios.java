package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    Controladora control = new Controladora();

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsu = new ArrayList<Usuario>();
        
        listaUsu = control.getUsuarios();
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaUsu", listaUsu);
               
        response.sendRedirect("verUsuarios.jsp");
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsu = request.getParameter("nombreusu");
        String pass = request.getParameter("password");
        String rol = request.getParameter("rol");
        
        
        control.crearUsuario(nombreUsu, pass, rol);
        
        response.sendRedirect("index.jsp");
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
