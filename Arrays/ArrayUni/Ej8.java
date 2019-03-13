package ArrayUni;

import java.util.Scanner;

/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("introduce el mes y la media de temperatura");
		
		int[] meses = new int[12];
		double[] temp=new double[12];
		for (int i = 0; i < 12; i++) {
			System.out.println("introduce el mes en numero(1-12)");meses[i]=s.nextInt();
			System.out.println("introduce la temperatura media de este mes");
			System.out.println("los decimales tienen que estar separados con ','");
			temp[i]=s.nextDouble();
			
		}
		System.out.println("  MESES  │   TEMP");
		for (int i = 0; i < 12; i++) {
			System.out.println(meses[i] +"           "+ temp[i]);
		
		
	}

	}}

