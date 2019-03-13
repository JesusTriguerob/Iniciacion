/*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/

public class Ej8 {

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

			
