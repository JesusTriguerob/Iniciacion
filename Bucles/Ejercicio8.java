package boletin5;

//*Muestra la tabla de multiplicar de un número introducido por teclado.

import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner (System.in);
			System.out.println("Introduce un numero entero");
			int num= s.nextInt();
			System.out.println("tabla del " + num);
			for (int i=0; i<=10; i++) {
				System.out.println(num + " * " + i + " = "+num*i);
			}
			
	}

}
