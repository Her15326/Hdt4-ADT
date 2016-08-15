/**
*main-ejecuta el programa utilizando la clase calculadora y sus respectivas interfaces
*@version: 3.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/

/**
 * libreria para solicitud de datos a usuario
 */ 
import java.util.Scanner;
/**
 * se declara la clase main
 */ 
public class main {
/**
 * se declara el main par ajecutar codigo en consola
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object objeto = new Object();
		Factory factory = new Factory();
		Scanner usuario = new Scanner(System.in);
		String direccion;
		direccion="";
		String seleccion1;
		seleccion1="";
		String seleccion2;
		seleccion2="";
		int secure;
		
		
		System.out.println("\n      ###########################################################");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      #___ CALCULADORA_(numero #2)______________________________#");
		System.out.println("      #__________________DESDE__________________________________#");
		System.out.println("      #__________________________ARCHIVOS_______________________#");
		System.out.println("      #____________________________________DE___________________#");
		System.out.println("      #_________________________________________TEXTO___________#");
		System.out.println("      #_________________________________________________TXT_____#");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      ###########################################################\n");
		
		/**
		 * ayuda a que no se produscan errores por parte del usuario
		 */
		try
		{
			secure=0;
			while (secure==0)
			{
				System.out.println("Que implementacion desea para el stack:\n    1)arrayList\n    2)vector\n    3)lista\n");
				seleccion1=usuario.next();
				
				if (seleccion1.equals("1") || seleccion1.equals("2") || seleccion1.equals("3"))
				{	
					if (seleccion1.equals("2") || seleccion1.equals("1"))
					{
						secure=1;
					}
						
					if (seleccion1.equals("3"))
					{	
						System.out.println("Has seleccionado lista, que metodo de STACK deseas implementar:\n    1)simplemente encadenada\n    2)doblemente encadenada\n    3)circular\n");
						seleccion2=usuario.next();
						if (seleccion2.equals("1") || seleccion2.equals("2") || seleccion2.equals("3"))
						{
							secure=1;
						}
					}
							
				}
				if (secure==0)
				{
					System.out.println("\n   Has ingresado un valor incorrecto, vuelve a intentarlo...\n");
				}
			}
			//solicitud de nombre de archivo
			System.out.println("Ingrese el nombre del archivo que contiene la operacion (incluir el .txt)\n recuerde que debe trabaja con valores int por lo cual\n este programa no trabaja valores con decimales\n");
			direccion= usuario.next();
			
			Calculadora calculadoraPrubea = new Calculadora();
			//String direccion = "ejemplo.txt";
		
			String instrucciones = calculadoraPrubea.leerArchivo(direccion);
			objeto = factory.tipoLista(seleccion1, seleccion2, instrucciones);
			System.out.println(instrucciones);
			int resultado = calculadoraPrubea.calcular(instrucciones);
			System.out.println("El resultado de la operacion es : "+resultado);
		}
		
		
		/**
		 * catch responde a errores prudcidos en el try
		 */
		catch(Exception e)
		{
			System.out.println("no se encontro archivo solicitado/ \nno esta bien definida la operacion");
		}
	}
}
