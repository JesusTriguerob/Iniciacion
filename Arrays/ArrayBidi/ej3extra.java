package bidimensionalesejercicios;

public class ej3extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num=new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*21+1);
			}
		int temp;
	    boolean flag = true;
	    
	    System.out.println("El tamaño del array es: "+(num.length-1)+"\n");
	    
	    for (int n : num){
	       System.out.print (n+" ");
	      }
	      
	      
	    System.out.println ("\n\n\n");
	 
	         while ( flag )
	         {
	                flag = false;  
	                for(int i=0;  i < num.length -1;  i++ )
	                {
	                       if ( num[ i ] > num[i+1] )
	                       {
	                               temp = num[ i ]; 
	                               num[ i ] = num[ i+1 ];
	                               num[ i+1 ] = temp;
	                              flag = true; 
	                      }
	                      if (i== num.length-2){
	                       System.out.print(num[i]+"   "); 
	                      }else{
	                       System.out.print(num[i]+" ");  
	                        }
	                
	                } 
	          }    
		}
	}


