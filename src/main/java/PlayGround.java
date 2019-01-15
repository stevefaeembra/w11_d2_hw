public class PlayGround extends Attraction implements ISecurity {

	public PlayGround(String name) {
		super(name);
	};

	@Override
	public boolean isAllowed(Visitor v) {
		return false;
	}

}
