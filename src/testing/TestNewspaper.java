package testing;
import main.Newspaper;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNewspaper {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetLocation()
	{
		Newspaper n = new Newspaper("Newspaper1", 01, 10, "21/07/2017", "The SUN", false);
		assertEquals("The SUN", n.getPublisher());
	}

}
