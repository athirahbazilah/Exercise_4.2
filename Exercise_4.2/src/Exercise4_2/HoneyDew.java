package Exercise4_2;

public class HoneyDew extends Fruit {
	
	private char grade;
	private int ripe;
	
	public HoneyDew() {
		
		super();
		grade = '-';
		ripe = 0;
	}
	
	public HoneyDew(String N, char G, int R) {
		
		super(N);
		grade = 'G';
		ripe = R;
		
		setDetail(N, G, R);
	}
	
	public void setDetail(String N, char G, int R) {
		this.grade = G;
		
		if (R >= 0)
			ripe = R;
		else
			ripe = 0;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public int getRipe() {
		return ripe;
	}
	
	public String toString() {
		return super.toString() + ("\nHoney Dew Constructor is Invoked" + "\nGrade: " + grade + "\nQuantity of Ripe: " + ripe);
	}

}
