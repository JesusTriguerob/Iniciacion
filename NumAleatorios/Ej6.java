/*Escribe un programa que piense un n�mero al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Despu�s de cada intento
fallido, el programa dir� cu�ntas oportunidades quedan y si el n�mero introducido
es menor o mayor que el n�mero secreto.*/

import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int numero;
		int numacierto=0;
		int contador=5;
		int intento=0;
		for (int i = 1; i <=1; i++) {
			numero= (int)(Math.random()*101);
			System.out.println(numero);
			while (numero>=0) {
			System.out.println("adivina un numero entre el 0 y 100");
			intento = s.nextInt();
				
			if (intento==numero) {
				System.out.println("enhorabuena, has acertado!");
				}
			if (intento<numero) {
				System.out.println("El numero que has introducido es menor, introduce uno mayor");
				contador--;
				System.out.println("Te quedan " + contador + " intentos");
			}	else  {
				System.out.println("El numero que has introducido es mayor, introduce uno menor");
				contador--;
				System.out.println("Te quedan " + contador + " intentos");
			if (contador<=0);
			System.out.println("lo siento, has alcanzado el maximo de intentos.");
			System.out.println("El numero correcto era el " + numero);
			}	
			
			}
		}
	}
}


