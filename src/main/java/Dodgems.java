public class Dodgems extends Attraction implements ITicketed {
	public Dodgems(String name) {
		super(name);
	};

	@Override
	public double defaultPrice() {
		return 0;
	}

	@Override
	public double priceFor(Visitor visitor) {
		return 0;
	}

}
