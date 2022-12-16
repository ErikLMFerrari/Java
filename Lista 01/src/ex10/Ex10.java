package ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Qual a diagonal menor do losângulo");
		float DP = dados.nextFloat();
		System.out.println("Qual a diagonal maior do losângulo");
		float DG = dados.nextFloat();
		float A = (DP * DG) / 2;
		System.out.println("A Area do Losângulo é: " + A);
		

	}

}
