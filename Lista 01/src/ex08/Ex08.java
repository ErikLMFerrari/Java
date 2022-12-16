package ex08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Digite a altura do Triângulo");
		float H = dados.nextFloat();
		System.out.println("Digite a base do triângulo");
		float B = dados.nextFloat();
        float A = (B * H) / 2;
        System.out.println("A área do triângulo é: " + A);
	}

}
