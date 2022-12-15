package lista3;

import java.util.Scanner;

public class Lista3_exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um salário mensal");
		float salarioMensal = sc.nextFloat();
		System.out.println("Digite o valor do reajuste em %");
		float reajuste = sc.nextFloat();
		float novoSalario = salarioMensal + ((salarioMensal * reajuste) / 100);
		
		System.out.println("O novo salário reajustado é de: " + novoSalario + "R$");
	}

}
