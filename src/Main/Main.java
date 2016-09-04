package Main;

import javax.swing.JOptionPane;

import Algoritmos.BurbujaOptimizada;
import Algoritmos.BusquedaBinaria;
import Algoritmos.Insercion;
import Algoritmos.Seleccion;
import Algoritmos.ShellShort;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub








		BurbujaOptimizada burbuja=new BurbujaOptimizada();
		BusquedaBinaria busqueda= new BusquedaBinaria();
		Insercion insercion=new  Insercion();
		Seleccion seleccion=new Seleccion();
		ShellShort shellShort=new ShellShort();
		
		String ax=null;
		int opcion=0;
		do{
			 ax = JOptionPane.showInputDialog("Ingrese el largo del vector: ");

			if(ax!=null){
			int cantidad= Integer.parseInt(ax);
			


			Desorden desorden=new Desorden(cantidad);

			String ax1 = JOptionPane.showInputDialog(

					"Su array es: "+desorden.dameArray()+
					"\nIngrese por que algoritmo desea ordenarlo: " +
					"\n1.Burbuja Optimizada" +
					"\n2.Busqueda Binaria" +
					"\n3.Seleccion" +
					"\n4.Insercion" +
					"\n5.Shell Short"
					+ "\n6.Salir");



			opcion=Integer.parseInt(ax1);




			switch (opcion) {
			case 1:

				burbuja.ordenar(desorden);



				break;

			case 2:
				busqueda.busquedaBinaria(burbuja.ordenar(desorden));
				break;

			case 3:
				
				seleccion.ordenar(desorden);
				
				break;

			case 4:

			insercion.ordenar(desorden);




				break;

			case 5:
				
				shellShort.ordenar(desorden);
				break;
				
			case 6:
				
				break;
			}

			}	
		}while(opcion!=6&&ax!=null);	

		
	}
	

}
