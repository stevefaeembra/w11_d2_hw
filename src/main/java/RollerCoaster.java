public class RollerCoaster extends Attraction implements ITicketed {
	public RollerCoaster(String name) {
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
