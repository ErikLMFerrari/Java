package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite um número");
		float n1 = dados.nextFloat();
		System.out.println("Digite outro número");
		float n2 = dados.nextFloat();
		float S = n1 + n2;
		System.out.println("A soma dos números é: " + S);

	}

}
