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
		
		System.out.println("Ingrese un número:");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro número:");
		valor2 = sc.nextInt();
				 
		if(valor1 > valor2)
		{
			System.out.println("El número" + valor1 + "es mayor que el número" + valor2);						
		}
		else
		{
			if(valor1 == valor2)
				{
				System.out.println("Los números son iguales");
				}
			else
			{
				if(valor1 < valor2)
				{
					System.out.println("el número" + valor1 + "es menor que el número" + valor2);
									
				}
			}
		}
				
	}
	
	public static void ejercicio1 () // operaciones: suma,resta, multiplicación y división.
	{
		Scanner sc = new Scanner (System.in);
		int valor1, valor2;
		
		System.out.println("Ingrese un número entero ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese otro número, por favor ");
		valor2 = sc.nextInt();
		
		int resultado = valor1 + valor2; //suma
		System.out.println("La suma es" + resultado);
		
		resultado = valor1 - valor2; //resta
		System.out.println("La resta es" + resultado);
		
		resultado = valor1 * valor2; //multiplicación
		System.out.println("La multiplicación es " + resultado);
		
		resultado = valor1 / valor2; //división
		System.out.println("La división es " + resultado);
				
	}
	
	
}
