package ArrayUni;

/*Escribe un programa que lea 10 n�meros por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el �ltimo en
mostrarse y viceversa.*/
import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner (System.in);
			
			System.out.println("introduce 10 numeros y te lo imprime en pantalla al reves");
				int[] num = new int[10];
				for (int i = 0; i <10; i++) {
					System.out.println("Introduce numero:");
					num[i]=s.nextInt();
				}
				for (int i = 9; i>=0; i--) {
					System.out.println(num[i]);
				}
	}

}
