package practica1;

import java.util.Scanner;

class Main {
	
		//pr�ctica1 
	
	
		//Men� empezado, realizando ejercicio uno (no terminado)

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int opcion;
		
		System.out.println("Bienvenido\nIngrese la opci�n deseada");
		System.out.println("1. Nivel Uno\n2. Nivel Dos\n3. Salir");
		opcion = leer.nextInt();
		
		switch (opcion) {
		case 1:
			//Entrando al Nivel 1
			
			int opcion2;
			
			System.out.println("\n\nBienvenido al Nivel Uno\nIngrese la oci�n deseada");
			System.out.println("\n1. Rombo con asteriscos\n2. Promedio de Notas\n3. Formato de Horas\n4. �reas y per�metros\n5. Diferencia de d�as\n6. Regresar");
			
			int op2;
			
			op2 = leer.nextInt();
			//Opciones en el nivel Uno			
			switch (op2) {
			case 1:	//Opci�n del rombo de asteriscos
				char espacio = ' '; 
			    char asterisco = '*'; 
			    for (int i= 1; i<=5; i++){ 
			           for (int espacios = 5 - i; espacios >0; espacios--)       
			                System.out.print(espacio); 
			                 for (int lineas = 1; lineas < 2 * i; lineas++) 
			                   System.out.print(asterisco); 
			                    System.out.println(""); 
			        } 
			        for (int i= 4; i>=1; i--){ 
			           for (int espacios = 5 - i; espacios >0; espacios--)       
			                System.out.print(espacio); 
			                 for (int lineas = 1; lineas < 2 * i; lineas++) 
			                   System.out.print(asterisco); 
			                    System.out.println(""); 			                    
			        }
			        System.out.println("\n1. Regresar\n2 Salir");
								
				break; //Fin del rombo con asteriscos
				
			case 2: //Opci�n de Promedio de Notas
				double num1, num2, num3, num4, num5, num6, suma;
				double promedio;
				
				Scanner s= new Scanner (System.in);
				
				System.out.println("Ingresa la primer nota:");
				num1 = s.nextInt();
				
				System.out.println("Ingresa la segunda nota:");
				num2 = s.nextInt();
				
				System.out.println("Ingresa la tercer nota:");
				num3 = s.nextInt();
				
				System.out.println("Ingresa la cuarta nota:");
				num4 = s.nextInt();
				
				System.out.println("Ingresa la quinta nota:");
				num5 = s.nextInt();
				
				System.out.println("Ingresa la sexta nota:");
				num6 = s.nextInt();
				
				suma = (num1+num2+num3+num4+num5+num6);
				promedio = (suma/6);
				
				System.out.println("\nSu promedio es "+promedio);
				
				System.out.println("\n   Media        Puntuaci�n\n  90-100	   A\n  80-89	   	   B\n  70-79	   	   C\n  60-69	   	   D\n   0-59	   	   E");
				System.out.println("1. Ingresar otras notas\n2. Regresar\n3. Salir");
				
				break; //FIN de Promedio de Notas
				
				

			default:
				break;
			}
			
			break;
			
		case 2:
			//Entrando al Nivel 2
			
			System.out.println("\n\nBienvenido al Nivel Dos\nIngrese la oci�n deseada");
			System.out.println("\n1. Calculadora Simple\n2. Tablas de Multiplicar\n3. N�mero al azar\n4. Conversi�n a n�meros Romanos\n5. Pir�mide de N�meros\n6. N�meros Romanos\n7. Password\n8. Letras del abecedario\n9. Cuadrado con asteriscos\n10. N�meros primos en un rango");
			break;
			
		case 3:
			//Salir del programa
			
			System.out.println("\n\nHa salido del programa");
		default:
			break;
		}
		
		

	}

}
