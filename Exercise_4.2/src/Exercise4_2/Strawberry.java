package Exercise4_2;

public class Strawberry extends Fruit {
	
	private String colour;
	private int weight;
	
	public Strawberry() {
		
		super();
		colour = "-";
		weight = 0;
	}
	
	public Strawberry(String N, String C, int W) {
		super(N);
		colour = C;
		weight = W;
		
		setDetail(N, C, W);
	}
	
	public void setDetail(String N, String C, int W) {
		this.colour = C;
		
		if (W >= 0)
			weight = W;
		else
			weight = 0;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return super.toString() + ("\nStrawberry Constructor is Invoked" + "\nColour: " + colour + "\nWeight: " + weight + " g");
	}

}
