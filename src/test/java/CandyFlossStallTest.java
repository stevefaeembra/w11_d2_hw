import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {

	private CandyFlossStall stall;

	@Before
	public void setUp() {
			stall = new CandyFlossStall("Floss2Go","Bob","Spot 2");
	}

	@Test
	public void setupOkay() {
		assertEquals("Floss2Go", stall.getName());
		assertEquals("Bob", stall.getOwnerName());
		assertEquals("Spot 2", stall.getParkingSpot());
	}


	@Test
	public void defaultPrice() {
		assertEquals(2.80, stall.defaultPrice(),.01);
	}

}