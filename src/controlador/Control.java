package controlador;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Object[] array=new Object[20];
	private Object[] array=null;
	private ArrayList<Object> lista = null;
	private HashMap<String, Object> mapa = null;   
   
    public Control() {
        super();
       
    }
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();		

		lista=new ArrayList<Object>();
		lista.add(true);
		lista.add("Pipi");
		lista.add(123);
		lista.add(333);
		this.getServletContext().setAttribute("lista", lista);

		mapa=new HashMap<String, Object>();
		mapa.put("1", false);
		mapa.put("2", 2);
		mapa.put("3", "123");
		mapa.put("4", 3.14f);
		this.getServletContext().setAttribute("mapa", mapa);

		array=new Object[5];
		array[0]=123;
		array[1]="123";
		array[2]=333.4f;
		array[3]=true;
		array[4]=LocalDate.now();
		this.getServletContext().setAttribute("array", array);
	
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String base = "/jsp/";
		String url = base + "index.jsp";
		String action = request.getParameter("action");
		System.out.println(action);
			
		if (action != null) {
			switch (action) {
			case "conJSTL":
				url = base + "conJSTL.jsp";
				break;
			case "sinJSTL":
				url = base + "sinJSTL.jsp";
				break;
			}
		}
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
