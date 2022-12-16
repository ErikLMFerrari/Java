package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		System.out.println("Escreva um número");
		float n1 = dados.nextFloat();
		float nf = n1 - 1;
		System.out.println("O antecessor do seu número é: " + nf);

	}

}
