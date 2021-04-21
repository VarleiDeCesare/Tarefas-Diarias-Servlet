package tarefas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroTarefasServlet")
public class RegistroTarefasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public RegistroTarefasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
		String tarefa = (String)request.getParameter("tarefa");
		String data = (String)request.getParameter("data");
		String descricao = (String)request.getParameter("descricao");
				
		Registro r = new Registro(tarefa, data, descricao);
		
		CadastroTarefas.cadastrarTarefa(r);	
		
		response.sendRedirect("ListaTarefas.jsp");
		
	}
}
