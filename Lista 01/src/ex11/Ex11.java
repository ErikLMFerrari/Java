package ex11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);	
		System.out.println("Qual a base menor do trapézio?");
		float BM = dados.nextFloat();
		System.out.println("Qual a base maior do trapézio?");
		float BG = dados.nextFloat();
		System.out.println("Qual a altura do Trapézio?");
		float H = dados.nextFloat();
		float A = (BM + BG) * H / 2;
		System.out.println("A área do trapézio é: " + A);

	}

}
