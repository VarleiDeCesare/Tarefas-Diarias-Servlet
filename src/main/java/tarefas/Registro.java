package tarefas;

public class Registro {
	private String tarefa;
	private String descricaoTarefa;
	private String data;
	
	
	public Registro(String tarefa, String descricaoTarefa, String data) {
		super();
		this.tarefa = tarefa;
		this.descricaoTarefa = descricaoTarefa;
		this.data = data;
	}
	
	
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}
	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Registro [tarefa=" + tarefa + ", descricaoTarefa=" + descricaoTarefa + ", data=" + data + "]";
	}
	
	
	
	
	
}
