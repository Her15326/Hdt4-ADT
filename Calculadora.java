
/**
*Calculadora, Esta se encarga de realizar los calculos para mostar el resultado del .txt con las instrucciones
*@version: 2.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/

import java.io.*;

public class Calculadora implements I_Calculadora{

	private Stack miPila;
	private String operaciones;
	
	public Calculadora()
	{
		this.miPila = new Stack();
		//*this.operaciones = "2 2 + 3 * ";	
	}
	
	/**
	 *metodo para calcular resultados a partir de un vector
	 */
	 
	public int calcularVector ([] String vector) {
		for(int posicion=0;posicion<vector.length;posicion++)
		{
			int element= vector[posicion];
			if ((element.equals("0")) || (element.equals("1")) || (element.equals("2")) || (element.equals("3")) || (element.equals("4")) || (element.equals("5")) || (element.equals("6")) || (element.equals("7")) || (element.equals("8")) || (element.equals("9")))
					{
						
					int intcaracter = Integer.parseInt(element);
					miPila.push(intcaracter);	

					}
				if (element.equals("*"))
					{
					int numero1= (int)miPila.pop();
					int numero2= (int)miPila.pop();
					int intresultado=(numero1*numero2);
					miPila.push(intresultado);
					}
					
				if (caracter.equals("/") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero1/numero2);
					miPila.push(intresultado);
					}
				
				if (caracter.equals("+") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero1+numero2);
					miPila.push(intresultado);
					}
					
				if (caracter.equals("-") )
					{
					int numero1=(int)miPila.pop();
					int numero2=(int)miPila.pop();
					int intresultado=(numero1-numero2);
					miPila.push(intresultado);
					}	
		}
		int resultado = (int)miPila.pop();
		return 	resultado;
	}
	
	
	
	
	
	

	/**
	 * Este metodo se encarga de leer un archivo de texto y almacenar en un string su contenido
	 * @param String, Recibe como parametro la direccion donde se encuentra el .txt con la operaciones a realizar
	 * @return String retorna el string que se encontraba en el .txt
	 */
	public String leerArchivo(String direccionx) {
		try {
			FileInputStream dirtxt;
			String path = new java.io.File(".").getCanonicalPath();
			path = path + "\\"+ direccionx;
			dirtxt = new FileInputStream(path);
			DataInputStream lineas = new DataInputStream(dirtxt);
			BufferedReader memoriabuf = new BufferedReader(new InputStreamReader(lineas));
			operaciones=memoriabuf.readLine();
			lineas.close();
		}catch(Exception e){
			System.err.println("Error Fatal");
			
		}
	
		return operaciones;
		
		
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *getMiPila retorna miPila 
	 */ 
	public Stack getMiPila() {
		return miPila;
	}
	
	/**
	 * setMiPila establece el valor de miPila
	 */
	
	public void setMiPila(Stack miPila) {
		this.miPila = miPila;
	}
	
	/**
	 * getOperaciones retorna la cadena de operaciones 
	 */
	
	public String getOperaciones() {
		return operaciones;
	}
	
	/**
	 *setOperaciones setea la cadena Operaciones 
	 */
	
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}

}
