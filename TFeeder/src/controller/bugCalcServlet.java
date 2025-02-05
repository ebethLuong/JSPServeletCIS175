package controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bugCalculatorObject;

/**
 * Servlet implementation class bugCalcServlet
 */
@WebServlet("/bugCalcServlet")
public class bugCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bugCalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//gets text from "userCents" button on index.jsp
		String stringSling = request.getParameter("numOfSlings"); 
		int intSling = tryParseInt(stringSling);
		//make the parseInts into a try parse and add try/catch to default to zero if it fails
		
		String stringJuvi = request.getParameter("numOfJuvis"); 
		int intJuvi = tryParseInt(stringJuvi);
		String stringSub = request.getParameter("numOfSubs"); 
		int intSub = tryParseInt(stringSub);
		String stringAdult = request.getParameter("numOfAdults");
		int intAdult = tryParseInt(stringAdult);
		String stringBugType = request.getParameter("feederType");
		
		bugCalculatorObject bugCalc = new bugCalculatorObject(intSling, intJuvi, intSub, intAdult, stringBugType);
		request.setAttribute("bugCalculation", bugCalc);
		getServletContext().getRequestDispatcher("/bugcalcresult.jsp").forward(request, response);
		
		

		
	
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

}
