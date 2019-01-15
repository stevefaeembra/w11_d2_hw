import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

	private Visitor visitor;

	@Before
	public void setUp() throws Exception {
		visitor = new Visitor(48, 195, 20.0);
	}

	@Test
	public void getAge() {
		assertEquals(48, visitor.getAge());
	}

	@Test
	public void getHeight() {
		assertEquals(195, visitor.getHeight());
	}

	@Test
	public void getMoney() {
		assertEquals(20.0, visitor.getMoney(), 0.0001);
	}

	@Test
	public void setMoney() {
		visitor.setMoney(10.0);
		assertEquals(10.0, visitor.getMoney(), 0.0001);
	}
}