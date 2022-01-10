

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jenkinsdocker.Main;

public class TestMain {
	@Test
	public void testInputIsEven()
	{
		assertTrue(Main.cheackIfInputIsAnEvenNumber(22));
	}

}