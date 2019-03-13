/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;



/**
 *
 * @author Jesús
 */
public class Estadisticas {

    private static boolean esPrimo;
    private static int cambiapilas;
    
public static boolean esCapicua (int N){ 
        int aux, inverso = 0, cifra;
       boolean flag=false;
        //le damos la vuelta al número
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
 
        if(N == inverso){
            flag=true;
        }
        return flag;
    }

public static boolean esPrimo(int x) {

for (int i = 2; i < x; i++) { 
if ((x % i) == 0) {
return false; 
} 
}
return true;
}

public static int siguientePrimo (int x){
// Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    while (!esPrimo(++x)) {};

    return x;
  }

public static double potencia (int base, int exponente){
     boolean potencia = false;
     if (exponente ==0){
        return 1;
    }
    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < exponente; i++) {
      n = n * base;
    }
       
    return n;
  }

public static int digitos(int x){
    int digitos = 0;
    while(x !=0) {
            x = x/10;
   digitos++;
 }
   return digitos;
  
    
}
 
public static int voltea (int x){
    int cifra;
    int inverso = 0;
        while(x!=0){
            cifra = x%10;
            inverso = (inverso * 10) + cifra;
            x/=10;
}
    return inverso;
    
}

 public static int digitoN(long x, int n) {
    x = voltea((int)x);
    while (n-->0) {
      x = x / 10;
    }
    return (int)x % 10;
  }
 
 public static int posicionDeDigito (int x, int d){
 int i;
    for (i = 0;(i < digitos(x)) && (digitoN(x, i)!= d); i++) {};
    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }

public static int quitaPorDetras(int x, int n) {
while (n--> 0) {
      x = x / 10;
    }
 
    return x = voltea((int) x);
  }
  
public static int quitaPorDelante(int x, int n){
   x = voltea((int) x);
    while (n-- > 0) {
      x = x / 10;
      
    }
 
    return x = voltea((int) x); 
    
}

public static String pegaPorDetras (int x, int n){
  

    
return x+""+n;
}

public static String pegaPorDelante (int x, int n){
    
    return n+""+x;
}

 public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos((int)x);
    x = quitaPorDelante((int)x, inicio);
    x = quitaPorDetras((int)x, longitud - fin - 1);
    return  x = voltea((int) x);
}

public static String pegaDosNumeros(int x, int n){
    
    return x+""+n;
}


}




