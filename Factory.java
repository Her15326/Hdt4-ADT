//##################################
//Universiad del Valle de Guatemala
//Algorirmos y Estructura de Datos
//Erick Bautista 15192
//Brandon Hernandez 15326
//##################################

import java.util.ArrayList;
public class Factory <E> {
	public Object tipoLista(String implementacionDeStack, String metodoDeStack, String instrucciones){
		
		//condicion para crear arrayList de instrucciones
		if(implementacionDeStack.equals("1"))
		{
			ArrayList listaAL = new ArrayList();
			
			
			for(int posicion=0;posicion<intrucciones.length();posicion++)
			{
				//nuestro array es de string
				String caracter=intrucciones.substring(posicion,posicion+1);
				listaAL.add(posicion,caracter);
			}	
			
			
		}
		//condicion para crear vector de instrucciones
		if(implementacionDeStack.equals("2"))
		{
			
			String [] listaS=new [intrucciones.length()] String();
			
			for(int posicion=0;posicion<intrucciones.length();posicion++)
			{
				String caracter=intrucciones.substring(posicion,posicion+1);
				listaS[posicion]=caracter;				
			}	
		}
		
		//condicion para crear lista de istrucciones
		if(implementacionDeStack.equals("3"))
		{
			if(metodoDeStack.equals("1"))
			{
				
			}
			if(metodoDeStack.equals("2"))
			{
				
			}
			if(metodoDeStack.equals("3"))
			{
				
			}
		}
		return null;
	}
}
