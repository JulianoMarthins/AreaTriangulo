package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do triâgulo: ");
		double base = scan.nextDouble();
		
		System.out.println("Digite a algura do triângulo: ");
		double altura = scan.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.printf("Area do triângulo: %.2f", area);
		
		
		scan.close();
	}

}
