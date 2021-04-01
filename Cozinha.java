import java.util.ArrayList;
import java.util.List;

public class Cozinha {
	private int horaAbertura; 
	private int horaFechamento; 
	private String pratoPrincipal;
	private List<Ingrediente> ingredientes = new ArrayList<>();
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal) {
		
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.pratoPrincipal = pratoPrincipal;
	}

	public int getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public int getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(int horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getPratoPrincipal() {
		return pratoPrincipal;
	}

	public void setPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	
	public String toString() {
		System.out.println("-----------------------------------");
		System.out.println("Prato principal: ");
		System.out.println(pratoPrincipal);
		System.out.println("\nIngredientes:");
		ingredientes.stream().forEach(System.out::println);
		System.out.println("\nFuncionarios:");
		funcionarios.stream().forEach(System.out::println);		
		System.out.println("-----------------------------------");
		return "";
	}
	
}
