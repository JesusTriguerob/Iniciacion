/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dado1=1;
		int dado2=0;
		int tiradadado1=0;
		int tiradadado2=0;
		
		while (dado1!=dado2) {
		//for (int i = 1; i <2; i++) {
			tiradadado1 = (int)(Math.random()*6+1);
			System.out.println("dado 1: " + tiradadado1);
			dado1=tiradadado1;
		//}
		//for (int i = 1; i <2; i++) {
			tiradadado2 = (int)(Math.random()*6+1);
			System.out.println("dado 2: "+ tiradadado2);
			dado2=tiradadado2;
		//}
			}
		System.out.println("Se ha repetido el mismo valor en ambos dados");
		
	}

}
