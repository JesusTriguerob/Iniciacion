package bidimensionalesejercicios;


	public class ej5 {

		  public static void main(String[] args) 
		    throws InterruptedException {
		 
		    int[][] num = new int[6][10];

		    int fila;
		    int columna;
		 
		    int minimo = Integer.MAX_VALUE;		    
		    int maximo = Integer.MIN_VALUE;

		    System.out.print("\n      ");
		    for(columna = 0; columna < 10; columna++) {
		      System.out.print("   " + columna + "  ");
		    }
		    System.out.println("");
		    System.out.println("-----------------------------------------------------------------");
		    
		   		    
		    for(fila = 0; fila < 6; fila++) {
		      System.out.print("  " + fila + "| ");
		      for(columna = 0; columna < 10; columna++) {
		        num[fila][columna] = (int)(Math.random() * 1001);
		        	
		        System.out.printf("%5d ", num[fila][columna]);
		        
		        if (num[fila][columna] < minimo) {
		          minimo = num[fila][columna];
		        }
		        
		        if (num[fila][columna] > maximo) {
		          maximo = num[fila][columna];
		        }
		      }
		      System.out.println("");
		    }
		   

		    System.out.println("\nEl máximo es " + maximo );
		    System.out.println("El mínimo es " + minimo );
		  }
		}