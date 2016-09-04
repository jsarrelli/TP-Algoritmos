package Algoritmos;

import Main.Desorden;

public class BurbujaOptimizada  extends Algoritmo{
	
	   public int [] ordenar(Desorden desorden){
		   
		   int []vec=desorden.getVector();
		  int vecviejo[]=cargarVector(vec);
		  
		  Long principio= System.nanoTime();
			System.out.println(principio);
			
		     
			
			
		
			int AUX;
			int N=vec.length, paso, j;
			boolean bandera=true;
			
			for(paso=0;paso<N-1&&bandera;paso++)
			/* si en el paso anterior no hubo cambios se detiene ciclo */
			  {
				bandera=false;
				for(j=0;j<N-paso-1;j++)
				/* las comparaciones van dismuyendo
				a medida que se efectuan los pasos */
				  {
					if(vec[j]>vec[j+1])
					  {
						bandera=true; /* indica si se han realizados cambios o no */
						AUX=vec[j+1];
						vec[j+1]=vec[j];
						vec[j]=AUX;
					  }
					
					
				  }
			  }
	                
	                Long fin=System.nanoTime();
            		  String tiempo=Long.toString((fin-principio)/1000);
            		  mostrar(vec,vecviejo,tiempo);
	                return vec;
	        
           
   }


}
