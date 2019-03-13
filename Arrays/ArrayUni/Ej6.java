package ArrayUni;



/*Escribe un programa que lea 15 n�meros por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posici�n 0
debe pasar a la posici�n 1, el de la 1 a la 2, etc. El n�mero que se encuentra en
la �ltima posici�n debe pasar a la posici�n 0. Finalmente, muestra el contenido
del array.*/ 
import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int[] num = new int[5];
		
		System.out.println("Introduce 10 numeros en pantalla");
		for (int i = 0; i < 5; i++) {
		num[i]=s.nextInt();	
		}
		
		System.out.println("Array original");
		for (int i = 0; i < 5; i++) {
		System.out.println(num[i]);
		}
		
		int numaux = num[4];
		for (int i = 4; i > 0; i--) {
	        num[i] = num[i-1];
	      
	      num[0] = numaux;
		}
		
		System.out.println("Array rotado a la derecha una posici�n:");
	      for (int i = 0; i < 5; i++) {
	        System.out.println(num[i]);
	      }
		}
	}


