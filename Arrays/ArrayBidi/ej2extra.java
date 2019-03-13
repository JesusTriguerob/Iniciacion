/*Construir un programa en java que permita encontrar el número mayor
 y el número menor de una serie de números ingresados por teclado, como primera entrada se le dará el tamaño del arreglo 
 y luego los datos, también se debe indicar cuantas veces se repiten tanto el mayor como el menor.
Ej
Entrada: 
2  -4   -13   1   -3   15   1   9   6   -8    4    23    7    -13    13    23    15    -13    9    0
Salida:
      El mayor es: 23 y se repite 2 veces.
      El menor es: -13  y se repite 3 veces.*/

package bidimensionalesejercicios;

import java.util.Scanner;

public class ej2extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			int[]num=new int[20];
			for (int i = 0; i < num.length; i++) {
				num[i]=s.nextInt();
			}
			int maximo=0;
			int minimo=0;
			
			for (int i = 0; i < num.length; i++) {
				if (num[i] > maximo) {
					maximo =num[i];
				}}
			int contador=0;
			for (int i = 0; i < num.length; i++) {
				if (maximo==num[i]) {
					contador++;
				}
			}
			System.out.println();
			System.out.println("esta repetido " + contador + " veces");
}

}
