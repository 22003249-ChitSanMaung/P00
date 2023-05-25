import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
//		fail("Not yet implemented");
		
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	@Test
	public final void testSubstract() {
//		fail("Not yet implemented");
		
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int excepted = 5555;
		assertEquals(actual, excepted);
	}
	
	@Test
	public final void testMultiple() {
//		fail("Not yet implemented");
		
		int a = 33;
		int b = 44;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int excepted = 1452;
		assertEquals(actual, excepted);
	}
	
	@Test
	public final void testDivide() {
//		fail("Not yet implemented");
		
		int a = 90;
		int b = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int excepted = 10;
		assertEquals(actual, excepted);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}

}
