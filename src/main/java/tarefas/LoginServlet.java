package tarefas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Boolean permitido;
	private List<User> users= new ArrayList<User>();
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		User usr1 = new User("admin", "admin");
		User usr2 = new User("teste", "teste");
		User usr3 = new User("login", "login");
		User usr4 = new User("a", "a");
		
		this.users.add(usr1);
        this.users.add(usr2);
        this.users.add(usr3);
        this.users.add(usr4);
        
        String u = request.getParameter("username");
        String p = request.getParameter("password"); 
        
        User uv = new User(u, p);

        for (User i : users) {
            if (users.contains(uv)) {
                this.permitido = true;
            } 
            else {
                this.permitido = false;
        }
      }
        if (this.permitido == true) {
           response.sendRedirect("RegistroTarefas.html");
     
        	
        }
        else {
           // response.sendRedirect("acesso-negado.html");
        	System.out.println("Azedou o chiclete");
        }
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
