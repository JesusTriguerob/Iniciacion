//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//tambi�n la suma total (los puntos que suman entre los tres dados).

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tirada;
		    int suma = 0;
		    
		    System.out.print("Tirada de tres dados: ");

		    for(int i = 0; i < 3; i++) {
		      tirada = (int)(Math.random() * 6) + 1;
		      System.out.print(tirada + " ");
		      suma += tirada;
		      
		    }
		System.out.println("");
		    System.out.println("Suma: " + suma);
	}

}
