package pak1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class ServletClass extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name1 = req.getParameter("name");
		String pass1 = req.getParameter("pass");
		
		resp.getWriter().print("serlvet name is "+name1+" servletl pass is "+pass1);
	}

	
}
