package lista3;

import java.util.Scanner;

public class Lista3_exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor B");
		float b= sc.nextFloat();
		
		float resposta = (float) Math.pow((a - b), 2);
		System.out.println("O resultado �: " + resposta);
	}

}
// Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do primeiro valor pelo segundo