package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=18 && idade>=25)
		{
			System.out.println("\nSua categoria � adulta.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nSua categoria � Juvenil.");
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.println("\nSua categoria � infantil.");
		}
		else
		{
			System.out.println("\nN�o h� nenhuma categoria essa com essa idade.");
			
		}
	}
}
