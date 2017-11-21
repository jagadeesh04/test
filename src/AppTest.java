import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testReturnString(){
		assertEquals("jag",App.middleThree("jag"));
	}
	
	@Test
	public void testReturnMiddleThree(){
		assertEquals("aga",App.middleThree("jagad"));
	}
	
	@Test
	public void testReturnMiddleThreeForBigString(){
		assertEquals("ish",App.middleThree("gangishetti"));
	}
}
