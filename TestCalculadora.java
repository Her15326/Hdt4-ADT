import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	
			
		Calculadora testCalc=new Calculadora();
		Stack testStack=new Stack();
		
		public void testcalcular(){
			
		}
		
		@Test
		public void testIsEmpty(){
			boolean resultado=testStack.isEmpty();
			assertEquals(false, resultado);
		}
		
		@Test
		public void testSize(){
			int resultado=testStack.size();
			assertEquals(1,resultado);
		}
		
		@Test
		public void testGetVector(){
			String resultado=testStack.getVector();
			assertEquals(null, resultado);
		}
		
		
		

}
