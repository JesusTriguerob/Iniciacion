/*Escribe un programa que pida 10 n�meros por teclado y que luego muestre
los n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado
del m�ximo y del m�nimo respectivamente.*/
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
		        System.out.print(" m�ximo");
		      }
		      if (i == posMin){
		        System.out.print(" m�nimo");
		      }
		      System.out.println();
		    }
		  }
		}