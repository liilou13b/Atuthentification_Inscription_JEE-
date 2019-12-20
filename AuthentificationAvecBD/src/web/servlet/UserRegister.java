package web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UtilisateurDao;
import metier.entities.Utilisateur;



@WebServlet(
        name = "register",
        description = "Controleur Register",
        urlPatterns = "/UserRegister"
)
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserRegister() {
        super();
     
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		String nom=request.getParameter("name");
		String prenom =request.getParameter("firstName");
		String confirmPassword=request.getParameter("password2");
		
		Utilisateur util=null;
		UtilisateurDao utilDao= new UtilisateurDao();
		
		String destPage="register.jsp;";
		
		if (password.equals(confirmPassword)) {
			util=new Utilisateur(login, password, nom,prenom);
		}
		try {
			if (utilDao.inscription(util)==true)
			{
					String message="vous avez bien inscrit";
					request.setAttribute("message",message);
					
					destPage ="login.jsp";
					
			}else {
				 String message = "Invalid email/password";
				 request.setAttribute("message", message);
			}
			
			RequestDispatcher dispatcher=request.getRequestDispatcher(destPage);
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
