/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.*/

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aleatorio=0;
		for (int i = 32; i < 127; i++) {
			aleatorio=(int) (Math.random()*50000000);
			System.out.print(aleatorio);
			
		}
	}

}
