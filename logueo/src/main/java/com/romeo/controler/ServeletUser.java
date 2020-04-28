package com.romeo.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.romeo.model.TbUsuariop;
import com.romeoDAO.UsuarioDao;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				String usu = request.getParameter("usuario");
				String contra = request.getParameter("contra");
				
				TbUsuariop usuario = new TbUsuariop();
				UsuarioDao usuDao = new UsuarioDao();
				
				usuario.setUsuario(usu);
				usuario.setContrasenia(contra);
				
				
				int verificausuario =  usuDao.ingresoUsuario(usuario).size();
				
				if (verificausuario == 1 ) {
					
					System.out.println("bienvenido");
				}else {
					System.out.println("ERROR");
				}

	}

}
