


package Algoritmos;



import javax.swing.JOptionPane;

import Main.Desorden;


public abstract class Algoritmo {


	public void mostrar(int[] vector, int[] vectorviejo,String tiempo)
	{
		JOptionPane.showMessageDialog(null, "El viejo array era: "+dameVector(vectorviejo)+
				"\nEl array ordenado es: "+dameVector(vector)+
				"\n La velocidad del algoritmo fue de: "+tiempo+" milisegundos");
	}

	public String dameVector (int[] vector)
	{
		String palabra = "";
		int i=1;
		for(Integer actual:vector)
		{
			palabra+= Integer.toString(actual);

			if(i<vector.length){palabra+="-";}
			i++;
		}

		return palabra;
	}



	public int[] cargarVector(int[] vector)
	{
		int []vectorviejo=new int[vector.length];
		int i=0;
		for(Integer actual:vector)
		{
			vectorviejo[i]=actual;
			i++;
		}
		return vectorviejo;


	}

	public abstract int[] ordenar(Desorden desorden);

	public String VectorToString(int []vector)
	{
		String palabra="";
		int i=0;
		for( i=0;i<vector.length;i++)
		{
			palabra+=Integer.toString(vector[i]);

			if(i!=vector.length-1)
			{
				palabra+="-";
			}
		}
		return palabra;
	}


}



