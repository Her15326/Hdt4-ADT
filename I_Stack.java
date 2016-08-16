/**
*I_Stack, Define los metodos que implementara la clase Stack 
*@version: 2.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/


public interface I_Stack{

	public void push(Object t);
	// post: agrega  un elemento a la pila
	public Object pop();
	// pre: hay un elemento en la pila
	// post: Carga el ultimo elemento de la pila y lo elemina de la pila
	public boolean isEmpty();
	// post: retorna si la lista esta vacia o no
	public int size();
	// post: retorna el tamaño de la pila
	public Object get();
	// post: almacena el valor de un objeto de la pila 
}
