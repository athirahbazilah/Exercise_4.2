package Exercise4_2;

public class Apple extends Fruit { //sub class
	
	protected int quantity;
	protected int price;
	
	public Apple() { //constructor for sub class
		
		super(); //inherit from super class (constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String N, int Q, int P) { //constructor sub class with argument
		
		super(N); //called method in superclass with passing parameter
		quantity = Q;
		price = P;
		
		setDetail(N, Q, P);
	}
	
	public void setDetail(String N, int Q, int P) {
		
		if (Q >= 0)
			quantity = Q;
		else
			quantity = 0;
		
		if (P >= 0)
			price = P;
		else
			price = 0;
	}
	
	public int TotalPrice() {
		return quantity * price;
	}
	
	public String toString() {
		return super.toString() + ("\nApple Constructor is Invoked" + "\nQuantity: " + quantity + "\nPrice: RM " + price + "\nTotal Price: RM " + TotalPrice());
	}

}
