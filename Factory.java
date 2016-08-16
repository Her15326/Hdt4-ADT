	//##################################
	//Universiad del Valle de Guatemala
	//Algorirmos y Estructura de Datos
	//Erick Bautista 15192
	//Brandon Hernandez 15326
	//##################################

	import java.util.*;
	public class Factory <E> {
		
		//public Object 
		public Object []  tipoLista(String implementacionDeStack, String metodoDeStack, String instrucciones)
		{
			//condicion para crear vector de instrucciones
			if(implementacionDeStack.equals("2"))
			{
				
				String [] listaS=new String [instrucciones.length()];
				
				for(int posicion=0;posicion<instrucciones.length();posicion++)
				{
					String caracter=instrucciones.substring(posicion,posicion+1);
					listaS[posicion]=caracter;				
				}	
				
				return listaS;
			}
			return null;
		}
		
		//condicion para crear arrayList de instrucciones
		public ArrayList<Object> tipoLista2(String implementacionDeStack, String metodoDeStack, String instrucciones)
		{
			if(implementacionDeStack.equals("1"))
			{
				ArrayList<Object> listaAL = new ArrayList<Object>();
				
				for(int posicion=0;posicion<instrucciones.length();posicion++)
				{
					//nuestro array es de string
					String caracter=instrucciones.substring(posicion,posicion+1);
					listaAL.add(posicion,caracter);
				}	
				return listaAL;
			}
			
		}
	
	
	
	}
