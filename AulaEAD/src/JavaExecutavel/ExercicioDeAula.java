package JavaExecutavel;

import java.util.Scanner;

public class ExercicioDeAula {

	public static void main(String[] args) {
		
		System.out.print("testando github");
		
		double x = 42.45;
		double y = 15.45;
		double resposta = (x * y) / 2.0;
		
		System.out.printf("o valor é: %.2f%n", resposta);
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		System.out.print("sua idade é " + idade);
		
		sc.close();
	}

}
