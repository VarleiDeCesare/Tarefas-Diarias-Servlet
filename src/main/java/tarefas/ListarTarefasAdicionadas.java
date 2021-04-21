package tarefas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListarTarefasAdicionadas {
	
public static List<Registro> obterTarefas(){
		
		Connection con;
		
		List<Registro> registros = new ArrayList<Registro>();
		
		try {
			
			String url = "jdbc:sqlite:C:\\Users\\Varlei\\Desktop\\Facul\\POO Avançado\\Codigos\\TarefasDiarias\\tarefas.db";
			
			con = DriverManager.getConnection(url);
			
			String sql = "SELECT * FROM registroTarefas ";
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				Registro p = new Registro(rs.getString("tarefa"), rs.getString("descricao"), rs.getString("data"));
				registros.add(p);
				
			}
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return registros;
	}
}
