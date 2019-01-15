public class CandyFlossStall extends Stall {

	public CandyFlossStall(String name, String ownerName, String parkingSpot) {
		super(name, ownerName, parkingSpot);
	}

	@Override
	public double defaultPrice() {
		return 2.80;
	}

	@Override
	public double priceFor(Visitor visitor) {
		return 0;
	}


}
