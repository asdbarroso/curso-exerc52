package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios funcionario = new Funcionarios();
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionario" + funcionario);
		System.out.println();
		
		System.out.println("Informa o percentual para atualizar o salario: ");
		double taxa = sc.nextDouble();
		
		funcionario.incrementaSalario(taxa);
		
		System.out.println();
		System.out.println("Dados atualizados " + funcionario);
		sc.close();
	}

}
