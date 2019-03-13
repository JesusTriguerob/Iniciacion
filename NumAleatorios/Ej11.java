/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int notas=0;
int Suspenso=0;
int Aprobado=0;
int Bien=0;
int Notable=0;
int Sobresaliente=0;
		for (int i = 1; i <21; i++) {
			notas=(int)(Math.random()*10+1);
			
		
		if (notas<5) {
			System.out.println("Suspenso");
			Suspenso++;
		}
		if(notas==5) {
			System.out.println("Aprobado");
			Aprobado++;
		}
		if ((notas>5)&&(notas<=7)) {
			System.out.println("Bien");
			Bien++;
		}
		if ((notas>7)&&(notas<9)) {
			System.out.println("Notable");
			Notable++;
		}
		if ((notas >=9)&&(notas<=10)) {
			System.out.println("Sobresaliente");
			Sobresaliente++;
		}
		}
		System.out.println(" ");
		System.out.println("Hay: ");
		System.out.println("Suspensos: " + Suspenso);
		System.out.println("Aprobados: " + Aprobado);
		System.out.println("Bienes: " + Bien);
		System.out.println("Notables: " + Notable);
		System.out.println("Sobresalientes: " + Sobresaliente);
	}

}
