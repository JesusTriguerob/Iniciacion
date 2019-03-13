/*Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).*/

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palos = "";
		String cartas = "";
		
		int numPalos = (int)(Math.random() *4 +1);
		String varpalos = String.valueOf(numPalos);
		
		switch (numPalos){
		case 1:
			palos = "picas";
			break;
		case 2:
			palos = "corazones";
			break;
		case 3:
			palos = "diamantes";
			break;
		case 4:
			palos = "tréboles";
			break;
		}
			
		int numCarta = (int) ((Math.random()*12 +1));
		String varcartas = String.valueOf(numCarta);
		switch (varcartas) {
		case "1":
			cartas = "A";
			break;
		case "10":
			cartas = "J";
			break;
		case "11":
			cartas = "Q";
			break;
		case "12":
			cartas = "K";
			break;
			default:
			cartas = varcartas;
			break;
		}
		
		System.out.println(cartas +" " + palos);
		
	
	
	
		}
		
	}


