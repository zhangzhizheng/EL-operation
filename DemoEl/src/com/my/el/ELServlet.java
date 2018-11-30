package com.my.el;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.my.domain.Fruits;

/**
 * Servlet implementation class ELServlet
 */
@WebServlet("/ELServlet")
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ELServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap<String,String> fruits=new HashMap<String,String>();
		fruits.put("f1", "西瓜");
		fruits.put("f2", "柠檬");
		
		Fruits fs1=new Fruits();
		fs1.setFname("芒果");
		fs1.setFprice(2);
		Fruits fs2=new Fruits();
		fs2.setFname("栗子");
		fs2.setFprice((float) 5.3);
		HashMap<String,Fruits> fruitMap=new HashMap<String,Fruits>();
		fruitMap.put("f1", fs1);
		fruitMap.put("f2",fs2);
		//fruits.put("f2", );
		HttpSession session=request.getSession();
		session.setAttribute("Fruits", fruitMap);
		request.setAttribute("Fruits", fruits);
		request.getRequestDispatcher("ELFile.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
