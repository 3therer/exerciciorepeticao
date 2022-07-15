package lacoRepeticao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		int x, n ,nPar,nImpar, contPar=0, contImpar=0;
		
					
		for(x=1;x<=10;x++)
		{
			System.out.println("\nInsira um número: ");
			n = leia.nextInt();
			
			if(n % 2 == 0)
			{
				nPar = n;
				contPar = contPar + 1;
			}
			else 
			{
				nImpar = n;
				contImpar = contImpar + 1;
			}
		}
		
		System.out.println("\nExistem "+contPar+" números pares.");
		System.out.println("\nExistem "+contImpar+" números ímpares.");

	}



	}

