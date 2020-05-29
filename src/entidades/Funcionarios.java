package entidades;

public class Funcionarios {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incrementaSalario(double taxa) {
		this.salarioBruto += (salarioBruto) *  taxa / 100;		
	}
	
	public String toString() {
		return "Empregado " + nome + " , R$ " + String.format("%.2f", salarioLiquido()); 
	}
	
}
