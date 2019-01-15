public class Dodgems extends Attraction implements ITicketed {
	public Dodgems(String name) {
		super(name);
	};

	@Override
	public double defaultPrice() {
		return 4.50;
	}

	@Override
	public double priceFor(Visitor visitor) {
		return 0;
	}

	@Override
	public int getRating() {
		return 0;
	}
}
