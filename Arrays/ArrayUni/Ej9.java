package ArrayUni;

import java.util.Scanner;

/*Realiza un programa que pida 8 n�meros enteros y que luego muestre esos
n�meros junto con la palabra �par� o �impar� seg�n proceda.*/

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		 int[] numero = new int[8];
		    int i;
		    
		    System.out.println("Introduzca 8 n�meros enteros, pulse INTRO despu�s de cada n�mero:");

		    for (i = 0; i < 8; i++) {
		      numero[i] = s.nextInt();
		    }

		    for (i = 0; i < 8; i++) {
		      if (numero[i] % 2 == 0) {
		        System.out.println(numero[i] + " par");
		      } else {
		        System.out.println(numero[i] + " impar");
		      }
		    }
		  }
		}