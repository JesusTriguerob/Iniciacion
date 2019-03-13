/*Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.*/
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 int[] numero = new int[20];
		    for (int i = 0; i < 10; i++){
		      System.out.print("Introduce el valor del array: ");
		      numero[i] = s.nextInt();
		    }
		    int maximo = numero[0];
		    int minimo = numero[0];
		    int posMax = 0;
		    int posMin = 0;
		    for (int i = 0; i < 10; i++){
		      if (numero[i] < minimo){
		        minimo = numero[i];
		        posMin = i;
		      }
		      if (numero[i] > maximo){
		        maximo = numero [i];
		        posMax = i;
		      }
		    }
		    for (int i = 0; i < 10; i++){
		      System.out.print(numero[i]);
		      if (i == posMax){
		        System.out.print(" máximo");
		      }
		      if (i == posMin){
		        System.out.print(" mínimo");
		      }
		      System.out.println();
		    }
		  }
		}