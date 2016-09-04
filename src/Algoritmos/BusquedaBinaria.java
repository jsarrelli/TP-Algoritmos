package Algoritmos;

import javax.swing.JOptionPane;

import Main.Desorden;

public class BusquedaBinaria extends Algoritmo
{

public int busquedaBinaria(int vector[])
{ 
	String aux= JOptionPane.showInputDialog("Ingrese el dato a buscar entre "+VectorToString(vector)+": ");
	
	int dato=Integer.parseInt(aux);
	
	
	  Long principio= System.nanoTime();
		System.out.println(principio);
		
		
		
	int n = vector.length; 
	int centro,inferior=0,superior=n-1; 
	while(inferior<=superior){ 
		centro=(superior+inferior)/2; 
		
		
		if(vector[centro]==dato){ JOptionPane.showMessageDialog(null, "El numero del vector:\n"+VectorToString(vector)+
				"\n se encuentra la posicion: "+(centro+1)); return centro;}
		
		else if(dato < vector [centro] ){ superior=centro-1; } 
		
		else { inferior=centro+1; } 
					} JOptionPane.showMessageDialog(null, "El numero no se encuentra"); return -1;
					
			
					 
		}

@Override
public int[] ordenar(Desorden desorden) {
	// TODO Auto-generated method stub
	return null;
}




}

