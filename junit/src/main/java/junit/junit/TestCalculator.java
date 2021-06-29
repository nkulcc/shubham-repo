package junit.junit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c=null;
	 CalculatorService calcService;
	
	 @BeforeClass  
	    public static void setUpBeforeClass()  {  
	        System.out.println("before class");  
	    }  
	 
	@Before
	public void setUp() {
		c=new Calculator();
		calcService = mock(CalculatorService.class);		
		c.setCalculatorService(calcService);
		 System.out.println("before");  
	}
	
	@Test
	public void testAddOperation() {
		 when(calcService.add(10.0,20.0)).thenReturn(30.00);
		 Assert.assertEquals(c.add(10.0, 20.0),30.0,0);
		 verify(calcService).add(10.0, 20.0);
	}
	
	  @After  
	    public void tearDown() throws Exception {  
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  
}
