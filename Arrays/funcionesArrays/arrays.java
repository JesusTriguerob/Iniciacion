/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesArrays;

/**
 *
 * @author jesus
 */
public class arrays {
    // Genera un array de tamaño n con números aleatorios
    // cuyo intervalo (mínimo y máximo) se indica como parámetro.
    
    
    
    
public static void muestraArrayInt(int x[]) {
    for (int n : x) {
    System.out.print(n + " ");
    }
    System.out.println();
  }

public static int[] generaArrayInt(int minimo, int maximo, int n) {
    int[] x = new int[n];

    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
    }
    return x;
  }
 
public static int minimoArrayInt(int[] x) {
 //Devuelve el mínimo del array que se pasa como
 //parámetro.
 int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }

public static int mediaArrayInt(int[] x){
    int suma = 0;
    int contador = 0;
    for (int n : x){
        suma += n;
        contador++;
    }
    return suma / contador;
}

public static boolean estaEnElArray(int[] x, int n){
    for (int num : x){
        if (num == n){
            return true;
        }
    }
    return false;
}

public static int posicionEnElArray(int[] x, int n){
   int i;
    for ( i = 0; i < x.length; i++) {
        if(x[i] == n){
            return i;
        }
    }
        return -i;
}

public static int[] volteaArrayInt (int [] x){
  int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
      
    return a;
  }

public static int[] rotaALaDerecha (int [] x, int n){
                
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }

public static int[] rotaALaIzquierda(int[] x, int n){
 int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
