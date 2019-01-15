public class RollerCoaster extends Attraction implements ITicketed, ISecurity {
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

	@Override
	public boolean isAllowed(Visitor v) {
		return false;
	}
}
