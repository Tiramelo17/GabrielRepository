
public class Funcionario {
	String nome;
	String atividade;
	public Funcionario(String nome, String atividade) {
		this.nome = nome;
		this.atividade = atividade;
	}
	public String toString() {
		return nome+": "+atividade;
	}
}
