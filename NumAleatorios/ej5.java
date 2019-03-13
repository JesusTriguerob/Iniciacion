/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros=0;
		int maximo=100;
		int minimo=199;
		for (int i = 0; i <=50; i++) {
		numeros = (int)(Math.random()*100 + 100);
		System.out.println(numeros+" ");
		if (numeros>maximo) {
			maximo=numeros;
		}
		if (numeros<minimo) {
			minimo=numeros;
		}
		}
		System.out.println("La media de todos los numeros es " +numeros/50);
		System.out.println("El minimo es " + minimo);
		System.out.println("El maximo es "+ maximo);
		
	}

}
