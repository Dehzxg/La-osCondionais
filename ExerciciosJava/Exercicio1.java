package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		float n1,n2,n3;
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite o primeiro numero: ");
	n1 = leia.nextFloat();
	System.out.println("\nDigite o segundo numero: ");
	n2 = leia.nextFloat();
	System.out.println("\nDigite o terceiro numero: ");
	n3 = leia.nextFloat();
	
		if(n1>n2 && n1>n3)
		{
			System.out.println("O número maior é: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("O número maior é"+n2);
		}
		else
		{
			System.out.println("O número maior é: "+n3);
		}
	}
}
	
