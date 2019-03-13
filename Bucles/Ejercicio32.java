package boletin5;
//Escribe un programa que, dado un número entero, diga cuáles son y cuánto
//suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
//izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
//números largos.

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			
			System.out.println("Introduce un numero entero y te dire cuales son y cuanto suman los digitos pares del mismo");
			long numintroducido = s.nextLong();
			
			while (numintroducido>0) {
			numintroducido = numintroducido % 10;
			}
			
			System.out.println(numintroducido);
			
			
			
			
			
	}

}
