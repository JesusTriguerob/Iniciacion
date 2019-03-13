package boletin5;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		/*Realiza un programa que pida primero un número y a continuación un dígito.
		El programa nos debe dar la posición (o posiciones) contando de izquierda a
		derecha que ocupa ese dígito en el número introducido.*/
		
		Scanner s = new Scanner(System.in);
		
		int num;
		int digito;
		
		System.out.println("Introduce un número: ");
		num = s.nextInt();
		
		System.out.println("Introduce un dígito: ");
		digito = s.nextInt();

		System.out.println("contando de izquierda a derecha, el "+digito+" aparece dentro de " + num + " en las siguientes posiciones: ");
		
		
		 // le da la vueta al número y calcula la longitud
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
	        
	    // comprueba la posición
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
