	//##################################
	//Universiad del Valle de Guatemala
	//Algorirmos y Estructura de Datos
	//Erick Bautista 15192
	//Brandon Hernandez 15326
	//15/08/2016
	//HDT4
	//##################################

import java.util.*;
public interface I_Calculadora{

	public int calcularVector(Object [] vectors);
	// pre: recibe el string con las intrucciones
	// post: regresa el resultado de las operacaciones
	public int calcularArrayList( ArrayList<Object> Array);
	// pre: Recibe ArrayList de intrucciones
	// post: regresa el resultado de las operaciones 
	public String toString();
	// post: imprime la operacion que se realizo	
	public String leerArchivo(String direccion);
	// pre:	Carga en un String la direccion de un Archivo
	// post: retorna en un String la operacion a realizar
}
