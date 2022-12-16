package ex12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Qual o raio do circulo?");
		float R = dados.nextFloat();
		float A = (float) (3.14 * (R * R));
		System.out.println("A área do circulo é: " + A);


	}

}
