package ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Insira a altura do triângulo");
		float H = dados.nextFloat();
		System.out.println("Insira a base do triângulo");
		float B = dados.nextFloat();
		float A = B * H;
		System.out.println("A área do triângulo é: " + A);
	}

}
