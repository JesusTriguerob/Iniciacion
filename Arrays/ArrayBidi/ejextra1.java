/*Llenar un array de tamaño 20 con números aleatorios en el mismo rango usando Math.random, luego, mostrar el mayor número de todos.*/

package bidimensionalesejercicios;

public class ejextra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       int[]arreglo = new int[20]; // creamos un arreglo para almacenar 20 elementos
	        int num = 0;
	        System.out.println("los numeros aleatorios son:");
	        for(int i = 0; i < arreglo.length; i++) {
	            arreglo[i] = (int)(Math.random()*20+1); //generamos un numero aleatorio
	            //en el rango buscado y lo almacenamos en el arreglo
	            System.out.print(arreglo[i] + ",");
	        }
	        int mayor = 0;
	        //buscamos el mayor numero
	        for(int i = 0; i < arreglo.length; i++) {
	            if(arreglo[i] > mayor) {
	                mayor = arreglo[i];
	            }
	        }
	        System.out.println();
	        System.out.println("el mayor elemento del arreglo es: " + mayor);
	    }
	  
					
					
	}
					



