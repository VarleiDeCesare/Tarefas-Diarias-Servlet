package tarefas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroTarefas {
	
	
public static void cadastrarTarefa(Registro r) {
		
		Connection con;
		
		try {
			
			String url = "jdbc:sqlite:C:\\Users\\Setup Dell\\Desktop\\AREA DE TRABALHO\\coisas da aula\\3- SEMESTRE\\POO AVANÇADO\\CodigosEclipse\\TarefasDiarias\\tarefas.db";
			
			con = DriverManager.getConnection(url);
						
			String sql = "INSERT INTO registroTarefas(tarefa, data, descricao) VALUES(?,?,?) ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r.getTarefa());
			ps.setString(2, r.getDescricaoTarefa());
			ps.setString(3, r.getData());
			
			ps.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

