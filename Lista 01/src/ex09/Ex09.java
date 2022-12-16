package ex09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Digite o Lado do Quadrado");
		float n1 = dados.nextFloat();
        float R = (float) Math.pow(n1, n1);
        System.out.println("A área do quadrado é: " + R);
	}

}
