/*Realiza un programa que vaya generando n�meros aleatorios pares entre 0
y 100 y que no termine de generar n�meros hasta que no saque el 24. El
programa deber� decir al final cu�ntos n�meros se han generado.*/

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumulador=0;
		int numale=0;
		while(numale!=24) {
			for (int i = 1; i < 2; i++) {
			numale = (int) (Math.random()*100+1);
			if (numale%2==0) {
				System.out.println(numale);
				acumulador++;
		}}}
	System.out.println("Se han generado "+ acumulador + " numeros hasta que ha sacado el 24.");
			
		
	

}}
