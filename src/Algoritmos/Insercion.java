package Algoritmos;


import java.util.Date;

import Main.Desorden;


public class Insercion extends Algoritmo{

	@Override
	public int[] ordenar(Desorden desorden) {


		Date principio=new Date();
		System.out.println(principio);
		int []vector=desorden.getVector();

		int[] vectorviejo=cargarVector(vector);

		int aux;
		for (int i = 1; i < vector.length; i++) {
			aux = vector[i];
			for (int j = i-1; j >=0 && vector[j]>aux; j--) {
				vector[j+1]=vector[j];
				vector[j]=aux;
			}
		}

		
		Date fin=new Date();

		String tiempo=Long.toString((fin.getTime() - principio.getTime()));
		mostrar(vector,vectorviejo,tiempo);
		return vector;

	}





}
