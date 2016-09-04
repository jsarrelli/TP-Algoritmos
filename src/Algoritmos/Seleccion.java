package Algoritmos;



import java.util.Date;

import Main.Desorden;

public class Seleccion extends Algoritmo {

	@Override
	public int[] ordenar(Desorden desorden) {
		
		Date principio=new Date();
		System.out.println(principio);
		
		int[] vector=desorden.getVector();

		int[] vectorviejo=cargarVector(vector);

		for (int i = 0; i < vector.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < vector.length; j++)
			{
				if (vector[j] <vector[min])
				{
					min = j;
				}
			}
			if (i != min) 
			{
				int aux= vector[i];
				vector[i] = vector[min];
				vector[min] = aux;
			}
		}

		
		Date fin=new Date();

		  String tiempo=Long.toString((fin.getTime() - principio.getTime()));
		  mostrar(vector,vectorviejo,tiempo);
		  return vector;

	}


}
