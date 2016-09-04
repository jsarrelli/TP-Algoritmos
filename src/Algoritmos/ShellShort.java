package Algoritmos;


import Main.Desorden;

public class ShellShort extends Algoritmo {

	
	
	public int[] ordenar(Desorden desorden) {
		 
		 int []vector=desorden.getVector();
		 int []vectorviejo=cargarVector(vector);
		 
		 Long principio= System.nanoTime();
			System.out.println(principio);
		 
	        final int N = vector.length;
	        int incremento = N;
	        do {
	            incremento = incremento / 2;
	            for (int k = 0; k < incremento; k++) {
	                for (int i = incremento + k; i < N; i += incremento) {
	                    int j = i;
	                    while (j - incremento >= 0 && vector[j] < vector[j - incremento]) {
	                        int tmp = vector[j];
	                        vector[j] = vector[j - incremento];
	                        vector[j - incremento] = tmp;
	                        j -= incremento;
	                    }
	                }
	            }
	        } while (incremento > 1);
	        
	        Long fin=System.nanoTime();
  		  String tiempo=Long.toString((fin-principio)/1000);
  		  mostrar(vector,vectorviejo,tiempo);
          return vector;
	        
	        
	        
	    }

}
