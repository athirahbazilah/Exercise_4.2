package Exercise4_2;

public class GreenApple extends Apple {
	
	private int seed;
	private int protein;
	
	public GreenApple() {
		
		super();
		seed = 0;
		protein = 0;
	}
	
	public GreenApple(String N, int Q, int P, int S, int Pr) {
		
		super(N, Q, P);
		seed = S;
		protein = Pr;
		
		setDetail(N, Q, P, S, Pr);
	}
	
	public void setDetail(String N, int Q, int P, int S, int Pr) {
		
		if (S >= 0)
			seed = S;
		else
			seed = 0;
		
		if (Pr >= 0)
			protein = Pr;
		else
			protein = 0;
	}
	
	public int getSeed() {
		return seed;
	}
	
	public int getProtein() {
		return protein;
	}
	
	public int TotalSeed() {
		return seed * quantity;
	}
	
	public int TotalProtein() {
		return quantity * protein;
	}
	
	public String toString() {
		return super.toString() + ("\nGreen Apple Constructor is Invoked" + "\nQuantity Seed: " + seed + "\nProtein: " + protein + " g" + "\nTotal Seed: " + TotalSeed() + "\nTotal Protein: " + TotalProtein() + " g");
	}

}
