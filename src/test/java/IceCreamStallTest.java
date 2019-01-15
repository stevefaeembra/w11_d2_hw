import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

	private IceCreamStall stall;

	@Before
	public void setUp() {
		stall = new IceCreamStall("Lucas Ice Cream","Lucas","Spot 3");
	}

	@Test
	public void allSetUp() {
		assertEquals("Lucas Ice Cream", stall.getName());
		assertEquals("Lucas", stall.getOwnerName());
		assertEquals("Spot 3", stall.getParkingSpot());

	}

	@Test
	public void defaultPrice() {
		assertEquals(2.80, stall.defaultPrice(),0.1);
	}

	@Test
	public void priceFor() {
	}
}