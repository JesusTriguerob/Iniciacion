package boletin5;
//*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//*por teclado.

import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s =new Scanner (System.in);
			
			
			System.out.println("Introduce un numero entero");
				int num = s.nextInt();
				int cifras = 1;
				if (num<0) {
					System.out.println("El numero debe ser positivo");
				}else {
				while(num>9){
					num=num/10;
					cifras++;
				}
				}
				if(num>=0) {
		System.out.println("El numero tiene " + cifras + " cifras");
	}}

}
