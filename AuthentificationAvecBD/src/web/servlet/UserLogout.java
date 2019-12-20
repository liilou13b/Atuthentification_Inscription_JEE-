package web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(
        name = "logout",
        description = "Controleur Logout",
        urlPatterns = "/UserLogout"
)
public class UserLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserLogout() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session =request.getSession(false);
		
		if(session!=null)
		{
			session.removeAttribute("util");
			
			RequestDispatcher requestDispatcher =request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
	
	}

}
