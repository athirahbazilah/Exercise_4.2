package Exercise4_2;

public class Avocado extends Apple {
	
	private int rotten;
	
	public Avocado() {
		
		super();
		rotten = 0;
	}
	
	public Avocado(String N, int Q, int P, int R) {
		
		super(N, Q, P);
		rotten = R;
		
		setDetail(N, Q, P, R);
	}
	
	public void setDetail(String N, int Q, int P, int R) {
		
		if (R >= 0)
			rotten = R;
		else
			rotten = 0;
	}
	
	public int getRotten() {
		return rotten;
	}
	
	public int TotalGood() {
		return quantity - rotten;
	}
	
	public int TotalPrice() {
		return (quantity * price) - (rotten * price);
	}
	
	public String toString() {
		return super.toString() + ("\nAvocado Constructor is Invoked" + "\nQuantity Rotten: " + rotten + "\nTotal Good: " + TotalGood());
	}

}
