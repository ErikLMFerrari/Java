package ex06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Escreva um número");
		float n1 = dados.nextFloat();
		System.out.println("Digite outro número");
		float n2 = dados.nextFloat();
		float Rest = n1 % n2;
		float Result = n1 / n2;
		System.out.println("A divisão deu " + Result + " e o resto foi de " + Rest);
		
	}

}
