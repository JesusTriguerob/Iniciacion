/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String cartas = "";
			String palos = "";
			
			int numPalos = (int)(Math.random()*4 +1);
			
			switch (numPalos) {
			case 1:
				palos = "Espada";
				break;
			case 2:
				palos = "Copas";
				break;
			case 3:
				palos = "Bastos";
				break;
			case 4:
				palos = "Oro";
				break;
			}
				
			int numcartas = (int)(Math.random()*10 +1);
			String varcartas = String.valueOf(numcartas);
			
			switch (varcartas) {
			case "1":
				cartas = "As";
				break;
			case "8":
				cartas = "Sota";
				break;
			case "9":
				cartas = "Caballo";
				break;
			case "10":
				cartas = "Rey";
				break;
			default:
				cartas = varcartas;
				break;
			}
				System.out.println(cartas +" de " + palos);
			}
	}


