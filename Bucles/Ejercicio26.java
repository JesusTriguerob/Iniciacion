package boletin5;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		/*Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito.
		El programa nos debe dar la posici�n (o posiciones) contando de izquierda a
		derecha que ocupa ese d�gito en el n�mero introducido.*/
		
		Scanner s = new Scanner(System.in);
		
		int num;
		int digito;
		
		System.out.println("Introduce un n�mero: ");
		num = s.nextInt();
		
		System.out.println("Introduce un d�gito: ");
		digito = s.nextInt();

		System.out.println("contando de izquierda a derecha, el "+digito+" aparece dentro de " + num + " en las siguientes posiciones: ");
		
		
		 // le da la vueta al n�mero y calcula la longitud
	    int numero = num;
	    int volteado = 0;
	    int longitud = 0;
	    int posicion = 1;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } // while
	        
	    // comprueba la posici�n
	    while (volteado > 0) {
	      if ((volteado % 10) == digito) {
	        System.out.print(posicion + " ");
	      }
	      volteado /= 10;
	      posicion++;
	    } // while

	    System.out.println();
	  }
	}
