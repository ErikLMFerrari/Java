package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	Scanner dados = new Scanner(System.in);	
	System.out.println("Digite um número");
	float n1 = dados.nextFloat();
	System.out.println("Digite outro número");
    float n2 = dados.nextFloat();
    float Sub = n1 - n2;
    System.out.println("A subtração dos números é: " + Sub);
	}

}
