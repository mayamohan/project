 package presidents;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PresidentServlet")
public class PresidentServlet extends HttpServlet
{
	PresidentsFileDAO presidentsDAO;
	PresidentsFileDAO2 presidentsFILEDAO2;
	String number;
	int number33 = 0;
	String previousTerm;
	String nextTerm;

	public void init() throws ServletException
	{
		ServletContext context = getServletContext();
		presidentsDAO = new PresidentsFileDAO(context);
		presidentsFILEDAO2 = new PresidentsFileDAO2(context);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		number = request.getParameter("termNumber");
		previousTerm = request.getParameter("termNumber2");
		nextTerm = request.getParameter("termNumber3");
		if (previousTerm != null)
		{
			number33 = Integer.parseInt((previousTerm.trim()));
			number33 = number33 - 1;
			number = String.valueOf(number33);

		}

		if (nextTerm != null)
		{
			number33 = Integer.parseInt((nextTerm.trim()));
			number33 = number33 + 1;
			number = String.valueOf(number33);

		}
		// System.out.println(number33);
		// number =String.valueOf(number33);
		
		PresidentBean PB1 = presidentsDAO.getPresident(number);

		PresidentBean2 PB2 = presidentsFILEDAO2.getPresident(number);
		// System.out.println(PB2.getName());
		
		HttpSession session = request.getSession();
		session.setAttribute("termNumber", number);
		session.setAttribute("presidents2", PB2);
		if (session.getAttribute("presidents") == null)
		{
			// first time
			session.setAttribute("presidents", new HashSet<PresidentBean>());
		//	session.setAttribute("presidents2", presidentsFILEDAO2);

		}

		if (PB1 != null)
		{
			Set<PresidentBean> presidentList = (Set<PresidentBean>) session.getAttribute("presidents");
			number = (String) session.getAttribute("termNumber");
			presidentList.add(PB1);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else
		{
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}



	}
}
