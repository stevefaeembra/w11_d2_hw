public abstract class Attraction implements IReviewed {

	private String name;

	public Attraction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
