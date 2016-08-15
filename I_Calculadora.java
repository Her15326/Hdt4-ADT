//##################################
//Universiad del Valle de Guatemala
//Algorirmos y Estructura de Datos
//Erick Bautista 15192
//Brandon Hernandez 15326
//##################################


public interface I_Calculadora{
	
	public int calcularVector(object);
	// pre: recibe el string con las intrucciones
	// post: regresa el resultado de las operacaciones
	public String toString();
	// post: imprime la operacion que se realizo	
	public String leerArchivo(String direccion);
	// pre:	Carga en un String la direccion de un Archivo
	// post: retorna en un String la operacion a realizar

	}
