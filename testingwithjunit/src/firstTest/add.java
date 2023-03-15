package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

	public class add {
		Calculator calc=new Calculator();
	

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			System.out.println("before test executed");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			System.out.println("After executing all test cases");
			
		}

		@Before
		public void setUp() throws Exception {
			System.out.println("Before each Test");
		}

		@After
		public void tearDown() throws Exception {
			System.out.println("After each test");
		}

		@Test
		public void testadd() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 4;
		int expectedValue = 9;
		int actualValue = calc.add(a,b);
		assertEquals(expectedValue,actualValue);
	}

}

