/**
*Stack, Esta se comporta como un repositorio para almacenar los datos ingresados a la calculadora
*@version: 3.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/


import java.util.*;
public class Stack implements I_Stack{
	
	private Vector<Object> vector1;
	
	public Stack(){
		vector1 = new Vector<Object>();
		vector1.add(0);
		
	}
	
	 /**
	 * Este metodo se utiliza para obtener la cantidad de elementos que hay en la pila
	 * @param no necesita
	 * @return el tamaño de la pila
	 */
	public int size(){
		return vector1.size();
		
	}
 	/**
 	 * Este metodo se utilizara para ingresar objetos a la pila
 	 * @param t Este sera el objeto que se ingresara a la pila
 	 * @return no regresa nada
 	 */

	public void push(Object t){
			vector1.add(t);
	}
	
	/**
	 * Este metodo se utilizara para obtener el ultimo objeto almacenado en la pila y eliminarlo 
	 * @param no necesita
	 * @return Object Regresa el ultimo objeto almacenado en la pila
	 */
	public Object pop() {
		Object t = vector1.lastElement();
		vector1.removeElementAt(vector1.size()-1);
		return t;
	}

	/**
	 * Este metodo se utiliza para verificar si el vector esta vacio o no 
	 * @param no necesita
	 * @return boolean Regresa un true o false dependiendo si esl vector esta vacio o no
	 */
	public boolean isEmpty() {
		return vector1.isEmpty();
	}

	/**
	 * Metodo get, sirve para obtener acceso a un atributo
	 * @param no recibe
	 * @return Regressa un valor especifico, en este caso null 
	 */
	public Object get() {
		Object t = vector1.get(vector1.size()-2);
		return t;
		}
	
	}



