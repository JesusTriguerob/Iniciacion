/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.*/

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for (int i = 0; i <=20; i++) {
				int numeros =(int)(Math.random()*10 +1);
				System.out.print(" "+numeros);
				
			}
	}

}
