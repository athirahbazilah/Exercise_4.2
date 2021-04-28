package Exercise4_2;

public class RedApple extends Apple {
	
	private String taste;
	private int calories;
	
	public RedApple() {
		
		super();
		taste = "-";
		calories = 0;
	}
	
	public RedApple(String N, int Q, int P, String T, int C) {
		super(N, Q, P);
		taste = T;
		calories = C;
		
		setDetail(N, Q, P, T, C);
	}
	
	public void setDetail(String N, int Q, int P, String T, int C) {
		this.taste = T;
		
		if (C >= 0)
			calories = C;
		else
			calories = 0;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public int TotalCalories() {
		return calories * quantity;
	}
	
	public String toString() {
		return super.toString() + ("\nRed Apple Constructor is Invoked" + "\nTaste: " + taste + "\nCalories: " + calories + "\nTotal Calories: " + TotalCalories());
	}

}
