import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

	private Dodgems dodgems;

	@Before
	public void setUp() {
		dodgems = new Dodgems("Bobs Dodgems");
	}

	@Test
	public void defaultPrice() {
		assertEquals(4.5, dodgems.defaultPrice(), 0.1);
	}

	@Test
	public void priceFor() {

	}

	@Test
	public void getRating() {
	}
}