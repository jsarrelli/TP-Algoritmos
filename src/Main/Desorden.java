package Main;
public class Desorden {


	private int cantidad;



	private int[]vector;

	public Desorden(int cantidad) {
		super();
		this.cantidad = cantidad;

		this.vector=new int[cantidad];




		for(int i=0;i<vector.length;i++)
		{
			
			int numero=(int) (Math.random()*20+1);
			if(!verificarexistencia(vector, numero))
			{
			vector[i]=numero;
			}
			else i--;
		}

		

	}







	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}















	public int[] getVector() {
		return vector;
	}







	public void setVector(int[] vector) {
		this.vector = vector;
	}







	public String dameArray ()
	{
		String palabra = "";
		int i=1;
		for(Integer actual:vector)
		{
			palabra+= Integer.toString(actual);

			if(i<cantidad){palabra+="-";}
			i++;
		}

		return palabra;
	}


public boolean verificarexistencia(int[]array,int numero)
{
	for(int actual:array)
	{
		if(actual==numero){
			return true;
		}
	}
	return false;
}


}




