package bidimensionalesejercicios;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num=new int[4][5];
		int fila;
		int columna;
		for ( fila = 0; fila < 4; fila++) {
			for ( columna = 0; columna < 5; columna++) {
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

		}
	/*System.out.println("-----------------------------------------------------------");
		

	int sumaColumna;
	int sumaTotal = 0;
	for(columna = 0; columna < 5; columna++) {
	  sumaColumna = 0;
	  for(fila = 0; fila < 4; fila++) {
	    sumaColumna += num[fila][columna];
	  }

	  sumaTotal += sumaColumna;
	  System.out.printf("%7d   ", sumaColumna);
	}
	System.out.printf("|%7d   ", sumaTotal);*/
	}
	
	}


