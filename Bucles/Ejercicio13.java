package boletin5;
//*Escribe un programa que lea una lista de diez números y determine cuántos
//*son positivos, y cuántos son negativos.
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			
			System.out.println("Programa que lee una lista de 10 numeros y determinará cuantos numeros positivos y negativos hay");
			//*int n1 = s.nextInt();
			//*int n2 = s.nextInt();
			//*int n3 = s.nextInt();
			//*int n4 = s.nextInt();
			//*int n5 = s.nextInt();
			//*int n6 = s.nextInt();
			//*int n7 = s.nextInt();
			//*int n8 = s.nextInt();
			//*int n9 = s.nextInt();
			//*int n10= s.nextInt();
				int numeros=0;
				int n= s.nextInt();
				int contadorpositivos = 0;
				int contadornegativos = 0;
				
	while (numeros<10) {
	if (n>0) {
		contadorpositivos = contadorpositivos + 1;
	} else if(n<0) {
		contadornegativos = contadornegativos + 1;
	}
	System.out.println("Por favor, introduzca el siguiente numero");
	n= s.nextInt();
	numeros++;
	
	}
	System.out.println("Numeros positivos         Numeros negativos");
	System.out.println(contadorpositivos + "                         " + contadornegativos);
	
			
			
									
													
	}

}
