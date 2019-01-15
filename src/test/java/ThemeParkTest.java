import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ThemeParkTest {

	private ThemePark themePark;
	private ArrayList<Attraction> attractions;
	private ArrayList<Stall> stalls;
	private Park park;
	private IceCreamStall whippy;

	@Before
	public void setUp() throws Exception {
		attractions = new ArrayList<>();
		stalls = new ArrayList<>();
		park = new Park("My Lovely Park");
		attractions.add(park);
		whippy = new IceCreamStall("Lucas", "Mrs Luca", "1");
		stalls.add(whippy);
		themePark = new ThemePark(attractions, stalls);
	}

	@Test
	public void startsWithAttractions() {
		assertEquals(attractions, themePark.getAttractions());
	}

	@Test
	public void startsWithStalls() {
		assertEquals(stalls, themePark.getStalls());
	}


}