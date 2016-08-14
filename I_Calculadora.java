/**
*I_Calculadora, Esta define los metodos que seran implementados en la calculadora
*@version: 3.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/


public interface I_Calculadora{
	public int calcular(String vector);
	// pre: recibe el string con las intrucciones
	// post: regresa el resultado de las operacaciones
	public String toString();
	// post: imprime la operacion que se realizo	
	public String leerArchivo(String direccion);
	// pre:	Carga en un String la direccion de un Archivo
	// post: retorna en un String la operacion a realizar
}
