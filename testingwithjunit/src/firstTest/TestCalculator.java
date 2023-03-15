package firstTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	
	Calculator calc=new Calculator();
	
	
	
	@Test
	public void testPower() {
	//	fail("Not yet implemented");
		int inputbase=2;
		int exp=3;
		int expectedvalue=8;
		int actualvalue=calc.power(inputbase, exp);
		assertEquals(expectedvalue,actualvalue);
	}
	
	

}
