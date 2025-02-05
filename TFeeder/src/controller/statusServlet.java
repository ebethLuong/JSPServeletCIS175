package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.statusObject;

/**
 * Servlet implementation class statusServlet
 */
@WebServlet("/statusServlet")
public class statusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public statusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stringDays = request.getParameter("daysSinceSnacc"); 
		//int intDays = tryParseInt(stringDays);
		double dblDays = tryParseDbl(stringDays);
		String stringDiam = request.getParameter("diamInInches"); 
		double dbDiam = tryParseDbl(stringDiam);
		
		statusObject statusObj = new statusObject(dblDays, dbDiam);
		request.setAttribute("feedMe", statusObj);
		getServletContext().getRequestDispatcher("/statusresult.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(statusObj.toString());
		//writer.close();
	}
	
	public int tryParseInt(String myIntString)
	{
		
		String intString = myIntString;
		int myInt;
		try
		{
			myInt = Integer.parseInt(intString);
		}
		catch(Exception except)
		{
			myInt = 0;
		}
		return myInt;
	}
	
	public double tryParseDbl(String myDblString)
	{
		
		String dblString = myDblString;
		double myDbl;
		try
		{
			myDbl = Double.parseDouble(dblString);
		}
		catch(Exception except)
		{
			myDbl = 1;
		}
		return myDbl;
	}

}
