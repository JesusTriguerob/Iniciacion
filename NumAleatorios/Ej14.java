import java.util.Scanner;
public class Ej14 {

  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Piensa un n�mero del 0 al 100. Intentar� adivinarlo en 5 intentos.");
    System.out.println("Pulsa la tecla INTRO cuando est�s preparado.");
 

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("�Es el " + numeroPensado + "?");
      System.out.print("El n�mero que est�s pensando es 1) mayor 2) menor 3) el mismo: ");
      mayorMenorOIgual =s.nextInt();
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("�Bien! �he acertado!");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("Vaya, no he conseguido acertar el n�mero.");
    }
  }
}