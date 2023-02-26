package es.ifp.programacion.uf1.practica.ejercicio1;

import java.util.Scanner;

/**
 * Programando la solución para la primera práctica evaluable de la UF1 de programación.
 * El Lenguaje utilizado es Java
 * 
 * El programa debe ser una calculadora que acepte números decimales que permita:
 * -Sumar
 * -Restar
 * -Multiplicar
 * -Dividir
 * -Resto
 * -Salir
 * Se debe ejecutar en bucle hasta que el usuario indique salir
 * 
 * La entrada a la operación se tendrá que hacer desde consola tanto indicando el número de la operación como indicando el símbolo de la operación
 * 
 * @author Kevin
 * @version 1.0.0
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0.0f, num2 = 0.0f, resultado = 0.0f;
		char operacion = 0;
		
		//Entrada de datos
		while  (operacion != '0' && operacion != 's' && operacion != 'S') {
		System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
		System.out.println("Introduzca uno pcion del menu:");
		System.out.println("1. Sumar (+)");
		System.out.println("2. Restar (-)");
		System.out.println("3. Multiplicar (*)");
		System.out.println("4. Dividir (/)");
		System.out.println("5. Resto. (%)");
		System.out.println("0. Salir (S o s)");
		System.out.println("Introduzca una opcion:");
		operacion = sc.nextLine().charAt(0);
		
		
		//Creando el menú y sus operaciones
			if(operacion == '1' || operacion == '+') {
				//Solicitud de datos para realizar la suma
				System.out.println("Introduzca el primer numero:");
				num1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("Introduzca el segundo numero:");
				num2 = Float.parseFloat(sc.nextLine());
				
				resultado = num1 + num2;
				System.out.println("===================================");
				System.out.println("La suma de "+num1+" y "+num2+" es "+resultado);
				System.out.println("===================================");
			}else {
				if(operacion == '2' || operacion == '-') {
					//Solicitud de datos para realizar la resta
					System.out.println("Introduzca el primer numero:");
					num1 = Float.parseFloat(sc.nextLine());
					
					System.out.println("Introduzca el segundo numero:");
					num2 = Float.parseFloat(sc.nextLine());
					
					resultado = num1 - num2;
					System.out.println("===================================");
					System.out.println("La resta de "+num1+" y "+num2+" es "+resultado);
					System.out.println("===================================");
				}else {
					if(operacion == '3' || operacion == '*') {
						//Solicitud de datos para realizar la multiplicacion
						System.out.println("Introduzca el primer numero:");
						num1 = Float.parseFloat(sc.nextLine());
						
						System.out.println("Introduzca el segundo numero:");
						num2 = Float.parseFloat(sc.nextLine());
						
						resultado = num1 * num2;
						System.out.println("===================================");
						System.out.println("La multiplicacion de "+num1+" y "+num2+" es "+resultado);
						System.out.println("===================================");
					}else {
						if(operacion == '4' || operacion == '/') {
							//Solicitud de datos para realizar la division
							System.out.println("Introduzca el primer numero:");
							num1 = Float.parseFloat(sc.nextLine());
							
							System.out.println("Introduzca el segundo numero:");
							num2 = Float.parseFloat(sc.nextLine());
							
							resultado = num1 / num2;
							System.out.println("===================================");
							System.out.println("La division entre "+num1+" y "+num2+" es "+resultado);
							System.out.println("===================================");
						}else {
							if(operacion == '5' || operacion == '%') {
								//Solicitud de datos para realizar el resto
								System.out.println("Introduzca el primer numero:");
								num1 = Float.parseFloat(sc.nextLine());
								
								System.out.println("Introduzca el segundo numero:");
								num2 = Float.parseFloat(sc.nextLine());
								
								resultado = num1 % num2;
								System.out.println("===================================");
								System.out.println("El resto entre "+num1+" y "+num2+" es "+resultado);
								System.out.println("===================================");
							}else {
								if (operacion == '0' || operacion == 's' || operacion == 'S') {
									System.out.println("El programa ha finalizado");
								}
								//El ejercicio indica que en caso de no introducir un numero entre 0 y 6 debe indicar opcion incorrecta.
								//Observo 2 defectos: 1- La introduccion de datos es de numeros entre 0 y 5 && 2- La entrada del usuario son tambien simbolos y letras
								//Si no se manejan el resto de errores puede interferir en la experiencia de usuorio negativamente.
								//Es por esto que he realizado esta operación menos elegante pero que permite manejar los errores.
								else{System.out.println("Opcion incorrecta");}
							}
						}
					}
				}
			}
		}
	}
}
