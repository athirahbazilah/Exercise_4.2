package Exercise4_2;

public class Fruit {
	
	protected String name;
	
	public Fruit() { //constructor with no argument
		name = "-";
	}
	
	public Fruit(String N) { //constructor with argument
		
		//name = "-"
		setDetail(N); //call method
	}
	
	public void setDetail(String N) { //overloading with parameter
		this.name = N;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return ("Fruit Constructor is Invoked" + "\nName: " + name);
	}

}
