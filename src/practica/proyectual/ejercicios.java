package practica.proyectual;

import java.util.Scanner ;

public class ejercicios {

	public static void main(String[] args)
	{
		ejercicio1();
		ejercicio2();
		
		
	}
	
	public static void ejercicio2 ()
	{
		Scanner sc = new Scanner (System.in);
		int valor1, valor2;
		
		System.out.println("Ingrese un n�mero:");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro n�mero:");
		valor2 = sc.nextInt();
				 
		if(valor1 > valor2)
		{
			System.out.println("El n�mero" + valor1 + "es mayor que el n�mero" + valor2);						
		}
		else
		{
			if(valor1 == valor2)
				{
				System.out.println("Los n�meros son iguales");
				}
			else
			{
				if(valor1 < valor2)
				{
					System.out.println("el n�mero" + valor1 + "es menor que el n�mero" + valor2);
									
				}
			}
		}
				
	}
	
	public static void ejercicio1 () // operaciones: suma,resta, multiplicaci�n y divisi�n.
	{
		Scanner sc = new Scanner (System.in);
		int valor1, valor2;
		
		System.out.println("Ingrese un n�mero entero ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro n�mero, por favor ");
		valor2 = sc.nextInt();
		
		int resultado = valor1 + valor2; //suma
		System.out.println("La suma es" + resultado);
		
		resultado = valor1 - valor2; //resta
		System.out.println("La resta es" + resultado);
		
		resultado = valor1 * valor2; //multiplicaci�n
		System.out.println("La multiplicaci�n es " + resultado);
		
		resultado = valor1 / valor2; //divisi�n
		System.out.println("La divisi�n es " + resultado);
				
	}
	
	
}
