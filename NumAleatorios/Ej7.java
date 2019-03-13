/*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).*/

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int partidos=0;
int apuesta1 = 0;	
int apuesta15=0;		

			for (int i = 1; i <15; i++) {
			System.out.println("partido " + i + ": ");
		
		
		for (int j = 1; j <=3; j++) {
			apuesta1= (int) (Math.random()*3+1);
			if (apuesta1==1) {
				System.out.println("                  1");
			}
			if (apuesta1==2) {
				System.out.println("                  X");
			}
			if (apuesta1==3) {
				System.out.println("                  2");
			}}}
			System.out.println("partido pleno al 15: " );
		
			for (int j = 1; j <2 ; j++) {
				apuesta15= (int) (Math.random()*3+1);
				if (apuesta1==1) {
					System.out.println("                  1");
				}
				if (apuesta1==2) {
					System.out.println("                  X");
				}
				if (apuesta1==3) {
					System.out.println("                  2");
				}
				
			}
		}
			
	}

	
