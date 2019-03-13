package boletin5;
//*Escribe un programa que muestre los n primeros términos de la serie de
//*Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
//*y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
//*los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
//*debe introducir por teclado.

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
		System.out.println("Programa que muestra los numeros que pidas de la serie fibonacci");
			int fibo1= 0;
			int fibo2= 1;
			int fiboant= 0;
			System.out.println("Indica cuantos numeros fibonacci quieres que aparezca en pantalla(maximo 13");
			int n = s.nextInt();
			
				for (int i=1; i<n; i++) {
					if (i==1) {
						System.out.println(fibo1 + ",");
					
					}else if(i==2) {
						System.out.println(fibo2 + ",");
					}else {
						System.out.println(fibo1 + fibo2 + ",");
						fibo1 = fiboant;
						fiboant = fibo2;
				        fibo2 += fibo1;
				        
					}
					}
				}
	}
