package practica.proyectual;

import java.util.Scanner ;

public class ejercicios {

	public static void main(String[] args)
	{
		ejercicio1();
		ejercicio2();
		ejercicio4();
		ejercicio5();
		ejercicio7();
	    ejercicios(); // 9 - 10 - 11
		
	}
	
    public static void ejercicios () // 9 - 10 - 11
    
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Por favor, ingrese varios  n�meros enteros y para finalizar ingrese un numero negavito");
    	long acumulador = 0;
    	
    	int maximo = 0;
    	int minimo = 0;
    	int num;
    	
    	num = sc.nextInt();
    	 
    	maximo = num;
    	minimo = num;
    	
    	while (num > 0) {
    		acumulador = acumulador + num;
    		if (num > maximo)
    		{
    			maximo = num;
    			
    		}
    		if (num < minimo)
    		{
    			minimo = num;
    		}
    		
    		num = sc.nextInt();
    		
    	}
      	
    System.out.println("La suma es " + acumulador);
    System.out.println("El n�mero m�s grande es " + maximo); // ejercicio 10
    System.out.println("El n�mero m�s chico es" + minimo);   // ejercicio 11
        
    			
    }
	
	public static void ejercicio7 ()
	{
		int i = 0;
		
		for(i = 0; i < 100; i = i +1)
			
		{
			if ((i % 2) == 0) // si es par
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	public static void ejercicio5 ()
	{
		Scanner sc = new Scanner (System.in);
		int calificacion1, calificacion2, calificacion3;
		
		System.out.println("Ingrese la nota del trabajo practico 1");
		calificacion1 = sc.nextInt();
		
		System.out.println ("Ingrese la nota del trabajo practico 2");
		calificacion2 = sc.nextInt();
		
		System.out.println("Ingrese la nota del trabajo practico 3");
		calificacion3 = sc.nextInt();
		
		int resultado = calificacion1 + calificacion2 + calificacion3;
						
		System.out.println(" El promedio de la nota final es " + resultado / 3);		
		
		if (resultado > 8)
		{
			System.out.println("Aprobado");
		}
		
	}
	public static void ejercicio4 ()
	{
		Scanner sc =new Scanner (System.in);
		int nota1, nota2, nota3; 
		
		System.out.println("Ingrese la nota del trabajo pr�ctico N�1");
		nota1 = sc.nextInt();
		
		System.out.println("Ingrese la nota del prabajo pr�ctico N�2");
		nota2 = sc.nextInt();
		
		System.out.println("Ingree la nota del trabajo pr�ctico N�3");
		nota3 = sc.nextInt();
		
		int resultado = nota1 + nota2 + nota2;
		
		System.out.println("La nota es " + resultado / 3);
		
		if (resultado > 7)
		{
			System.out.println("Aprobado");
					
		}
		else
		{
			if (resultado < 7);
			{
				System.out.println("Desaprobado");
								
			}
		}
			
		
		
		
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
			System.out.println("El n�mero " + valor1 + " es mayor que el n�mero " + valor2);						
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
					System.out.println("El n�mero " + valor1 + " es menor que el n�mero " + valor2);
									
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
		System.out.println("La suma es " + resultado);
		
		resultado = valor1 - valor2; //resta
		System.out.println("La resta es " + resultado);
		
		resultado = valor1 * valor2; //multiplicaci�n
		System.out.println("La multiplicaci�n es " + resultado);
		
		resultado = valor1 / valor2; //divisi�n
		System.out.println("La divisi�n es " + resultado);
				
	}
	
	
}
