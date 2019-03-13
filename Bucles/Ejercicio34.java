package boletin5;

import java.util.Scanner;
public class Ejercicio34 {

	public static void main(String[] args) {
		/*Escribe un programa que pida dos n�meros por teclado y que luego mezcle en
		dos n�meros diferentes los d�gitos pares y los impares. Se van comprobando
		los d�gitos de la siguiente manera: primer d�gito del primer n�mero, primer
		d�gito del segundo n�mero, segundo d�gito del primer n�mero, segundo
		d�gito del segundo n�mero, tercer d�gito del primer n�mero� Para facilitar
		el ejercicio, podemos suponer que el usuario introducir� dos n�meros de la
		misma longitud y que siempre habr� al menos un d�gito par y uno impar. Usa
		long en lugar de int donde sea necesario para admitir n�meros largos.*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce los dos n�meros seguidos ");
		long  num1 = s.nextLong();
		long num2= s.nextLong();
		
		//dar la vuelta al primer n�mero
		
		long numero = num1;
		long volteado1=0;
		long longitud=0;
		if (numero==0) {
			longitud=1;
		}
		
		while (numero > 0) {
		    volteado1 = (volteado1 * 10) + (numero % 10);
		      numero /= 10;
		      longitud++;		
		      
		}
		//dar la vuelta al segundo n�mero
		
		numero = num2;
		long volteado2=0;
		
		while (numero > 0) {
			volteado2 = (volteado2*10)+(numero%10);
			numero/=10;
		}
		
//		recorrer los 2 n�umeros para compatat resultados
		long resultadoPares=0;
		long resultadoImpares=0;
		int digito;
		
		for(int i = 0; i < longitud; i++) {
			digito = (int)(volteado1 % 10);
			if ((digito % 2)==0) {
				resultadoPares = resultadoPares * 10 + digito;
				
			}else {
				resultadoImpares = resultadoImpares *10+digito;
			}
			
		    volteado1 = (volteado1 * 10) + (numero % 10);
		      numero /= 10;
		      longitud++;
		}
;
	}
}