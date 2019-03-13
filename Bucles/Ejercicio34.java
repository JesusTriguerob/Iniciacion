package boletin5;

import java.util.Scanner;
public class Ejercicio34 {

	public static void main(String[] args) {
		/*Escribe un programa que pida dos números por teclado y que luego mezcle en
		dos números diferentes los dígitos pares y los impares. Se van comprobando
		los dígitos de la siguiente manera: primer dígito del primer número, primer
		dígito del segundo número, segundo dígito del primer número, segundo
		dígito del segundo número, tercer dígito del primer número… Para facilitar
		el ejercicio, podemos suponer que el usuario introducirá dos números de la
		misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
		long en lugar de int donde sea necesario para admitir números largos.*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce los dos números seguidos ");
		long  num1 = s.nextLong();
		long num2= s.nextLong();
		
		//dar la vuelta al primer número
		
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
		//dar la vuelta al segundo número
		
		numero = num2;
		long volteado2=0;
		
		while (numero > 0) {
			volteado2 = (volteado2*10)+(numero%10);
			numero/=10;
		}
		
//		recorrer los 2 nçumeros para compatat resultados
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