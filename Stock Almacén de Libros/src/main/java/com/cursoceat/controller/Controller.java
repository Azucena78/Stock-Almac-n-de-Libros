package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.modell.Libros;
import com.cursoceat.servicios.Validacion;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet implements Validacion{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String msg=null;
	List<Libros> listaL = new ArrayList<Libros>();
	
    public Controller() {
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
		doGet(request, response);
		String nombreL=request.getParameter("nombre");
		String autorL=request.getParameter("autor");
		String isbnTem=request.getParameter("isbn");
		String sinopsisL=request.getParameter("sinopsis");
		
		String isbnL="";
		if (isbnTem.length()== 10) {
			 isbnL="978-"+request.getParameter("isbn");
		}else {
			msg="La longitud numérica no es correcta.";
		}
		
		
		
	
	if(validaCantidad(request.getParameter("cantidad"))){
		int cantidadL=Integer.parseInt(request.getParameter("cantidad"));
		
		
		Libros lis = new Libros(nombreL.toUpperCase(), pasarPmayuscula(autorL), cantidadL, isbnL, sinopsisL);
		listaL.add(lis);
		msg="El libro se ha creado correctamente.";
		request.getSession().setAttribute("libros", listaL);
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect("index.jsp");
		
	}else {
		msg="La cantidad debe ser numérica.";
		request.getSession().setAttribute("msg", msg);
//		request.setAttribute("msg", msg);
		/**
		 * Ese error lo tengo que despachar a la vista.
		 */
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
	}

