package boletin5;
//*Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
//*n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
//*acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�
//*y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
//*Tendremos cuatro oportunidades para abrir la caja fuerte.


import java.util.Scanner;
public class Ejercicio7 {

	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
					int intentos = 4;
					
boolean passcorrecta = false;

			System.out.println("Por favor, introduzca la combinacion de apertura (4 cifras)");
					int passintroducida= s.nextInt();
						if (passintroducida ==1234) {
							passcorrecta = true;
						} else {
			System.out.println("Clave Incorrecta");
		}
	

	 while ((intentos > 1) && (passcorrecta==false)) {
    
			if (passcorrecta) {
		      System.out.println("Ha abierto la caja fuerte.");
		    } else {
		      System.out.println("Lo siento, la caja sigue bloqueada.");
		    }
			intentos --;
			System.out.println("Por favor, introduzca otra cifra (4 cifras)");
			passintroducida= s.nextInt();
				
    }
  }
}
