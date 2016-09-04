package Algoritmos;

import Main.Desorden;

public class BurbujaOptimizada  extends Algoritmo{
	
	   public int [] ordenar(Desorden desorden){
		   
		   int []vec=desorden.getVector();
		  int vecviejo[]=cargarVector(vec);
		  
		  Long principio= System.nanoTime();
			System.out.println(principio);
			
		     
	                final int N=vec.length;
	                for(int i=N-1;i>0;i--){
	                        for(int j=0;j<i;j++){
	                                if(vec[j]>vec[j+1]){
	                                        int temp=vec[j];
	                                        vec[j]=vec[j+1];
	                                        vec[j+1]=temp;
	                                }
	                        }
	                        
	                }
	                
	                Long fin=System.nanoTime();
            		  String tiempo=Long.toString((fin-principio)/1000);
            		  mostrar(vec,vecviejo,tiempo);
	                return vec;
	        
           
   }


}
