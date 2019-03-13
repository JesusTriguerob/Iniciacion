package bidimensionalesejercicios;

public class ej4 {

	public static void main(String[] args) 
		    throws InterruptedException {
		int[][] num=new int[4][5];
		int fila;
		int columna;
		System.out.println("por favor, introduzca los 20 numeros del array");
		for ( fila = 0; fila < 4; fila++) {
			for ( columna = 0; columna < 5; columna++) {
				System.out.println("fila "+ fila +", columna " + columna +  ":");
				for (int i = 0; i < 20; i++) {
					
				num[fila][columna]=(int)(Math.random()*900+100);}
			}
		}
			
			int sumaFila;
		for ( fila = 0; fila <4; fila++) {
			 sumaFila=0;
			for ( columna = 0; columna <5; columna++) {
				System.out.printf("%7d   ", num[fila][columna]);
				sumaFila += num[fila][columna];
			}
		      System.out.printf("|%7d\n", sumaFila);
		      Thread.sleep(500);

		}
	System.out.println("-----------------------------------------------------------");
		

	int sumaColumna;
	int sumaTotal = 0;
	for(columna = 0; columna < 5; columna++) {
	  sumaColumna = 0;
	  for(fila = 0; fila < 4; fila++) {
	    sumaColumna += num[fila][columna];
	  }

	  sumaTotal += sumaColumna;
	  System.out.printf("%7d   ", sumaColumna);
	  Thread.sleep(500);
	}
	System.out.printf("|%7d   ", sumaTotal);
	Thread.sleep(500);
	}
	
	}



