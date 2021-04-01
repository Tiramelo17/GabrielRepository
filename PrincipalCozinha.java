
public class PrincipalCozinha {

	public static void main(String[] args) {
		Cozinha min = new Cozinha(14, 20, "feijoada");
		Ingrediente I1,I2,I3,I4,I5;
		Funcionario f1,f2,f3,f4;
		min.setIngredientes(I1 = new Ingrediente("Feijão"));
		min.setIngredientes(I2 = new Ingrediente("Farinha"));
		min.setIngredientes(I3 = new Ingrediente("Arroz"));
		min.setIngredientes(I4 = new Ingrediente("Carne de porco"));
		min.setIngredientes(I5 = new Ingrediente("Linguiça"));
		min.setFuncionarios(f1 = new Funcionario("joão","Temperador"));
		min.setFuncionarios(f2 = new Funcionario("Marcio","Cozinheiro Chefe"));
		min.setFuncionarios(f1 = new Funcionario("joaquim","Garson"));
		min.setFuncionarios(f1 = new Funcionario("Malaque","Asistente"));
		
		Cozinha chinesa = new Cozinha(10, 21, "Yakissoba");
		chinesa.setIngredientes(I1 = new Ingrediente("Champignon"));
		chinesa.setIngredientes(I2 = new Ingrediente("Brócolis"));
		chinesa.setIngredientes(I3 = new Ingrediente("Macarrão"));
		chinesa.setIngredientes(I4 = new Ingrediente("Carne"));
		chinesa.setFuncionarios(f1 = new Funcionario("Gabriel","Cozinheiro chefe"));
		chinesa.setFuncionarios(f2 = new Funcionario("Luiz","Atendente"));
		chinesa.setFuncionarios(f1 = new Funcionario("Guilherme","Assistente"));

		
		Cozinha ita = new Cozinha(13, 22, "Macarrão");
		ita.setIngredientes(I1 = new Ingrediente("Molho"));
		ita.setIngredientes(I2 = new Ingrediente("Macarrão"));
		ita.setIngredientes(I3 = new Ingrediente("Carne"));
		ita.setFuncionarios(f2 = new Funcionario("Franchesco","Cozinheiro"));
		ita.setFuncionarios(f1 = new Funcionario("Paola","Assitente"));
		
		System.out.println(min);
		System.out.println(chinesa);
		System.out.println(ita);
	}

}
