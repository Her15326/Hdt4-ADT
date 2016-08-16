//##################################
	//Universiad del Valle de Guatemala
	//Algorirmos y Estructura de Datos
	//Erick Bautista 15192
	//Brandon Hernandez 15326
	//##################################

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
		
		// objetos del main para trabajar en la interface con el usuario
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
		int resultado;
		resultado=0;
		
		
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
			
			//ciclo (con programacion defensiva) para determinar la forma de trabajar por parte del usuario
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
			
			//se crea objeto tipo calculadora
			Calculadora calculadoraPrubea = new Calculadora();
			
			//se almacena en el String intrucciones en el string intrucciones
			String instrucciones = calculadoraPrubea.leerArchivo(direccion);
			
			//se imprimen las intrucciones en pantalla
			System.out.println(instrucciones);
			
			//se almacenan las intrucciones en el formato seleccionado por el usuario en el object llamado objeto
			//objeto = factory.tipoLista(seleccion1, seleccion2, instrucciones);
			
			//realizar operacion si se lecciono metodo de arrayList
			if (seleccion1.equals("1"))
			{
			//objeto = factory.tipoLista(seleccion1, seleccion2, instrucciones);
			//int resultado=calculadoraPrubea.calcularArrayList(objeto);
			}
			
			//realizar operacion si se lecciono metodo de vector
			if (seleccion1.equals("2"))
			{
				objeto = factory.tipoLista(seleccion1, seleccion2, instrucciones);
				String [] ob= objeto.toString();
				resultado=calculadoraPrubea.calcularVector(ob);
				
			}
			
			//realizar operacion si se lecciono metodo de listas
			if (seleccion1.equals("3"))
			{
			//NAC
			}
			//int resultado = calculadoraPrubea.calcular(instrucciones);
			System.out.println("El resultado de la operacion es : " + resultado);
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
