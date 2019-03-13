/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int caracteres=0;						
		for (int i = 0; i < 10; i++) {
			int longitud = (int)(Math.random()*40+1);
			caracteres = (int) (Math.random()*6+1);
				for (int j = 1; j < longitud; j++) {
					if (caracteres==1) {
						System.out.print("* ");
					}}
				for (int j = 1; j < longitud; j++) {
					if (caracteres==2) {
						System.out.print("- ");
					}
					}
				for (int j = 1; j < longitud; j++) {
					if (caracteres==3) {
						System.out.print("= ");
					}}
				for (int j = 1; j < longitud; j++) {
					if (caracteres==4) {
						System.out.print(". ");
					}}
				for (int j = 1; j < longitud; j++) {
					if (caracteres==5) {
						System.out.print("| ");
					}}
				for (int j = 1; j < longitud; j++) {
					if (caracteres==6) {
						System.out.print("@ ");
					}}
			System.out.println("");
		}
	}

}
