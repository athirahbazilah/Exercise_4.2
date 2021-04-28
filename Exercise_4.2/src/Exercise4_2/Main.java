package Exercise4_2;

public class Main {

	public static void main(String[] args) {
		
		Fruit objFruit = new Fruit("Fruit");
		System.out.println("***************FRUIT***************");
		System.out.println(objFruit); //print using overriding method
		System.out.println();
		
		Apple objApple = new Apple("Apple", 7, 6);
		System.out.println("***************APPLE***************");
		System.out.println(objApple);
		System.out.println();
		
		Strawberry objStraw = new Strawberry("Strawberry", "Red", 12);
		System.out.println("***************STRAWBERRY***************");
		System.out.println(objStraw);
		System.out.println();
		
		HoneyDew Melon = new HoneyDew("Honey Dew", 'B', 30);
		System.out.println("***************HONEY DEW***************");
		System.out.println(Melon);
		System.out.println();
		
		Avocado objAvo = new Avocado("Avocado", 10, 5, 3);
		System.out.println("***************AVOCADO***************");
		System.out.println(objAvo);
		System.out.println();
		
		RedApple objRed = new RedApple("Red Apple", 15, 2, "Sweet", 95);
		System.out.println("***************RED APPLE***************");
		System.out.println(objRed);
		System.out.println();
		
		GreenApple objGreen = new GreenApple("Green Apple", 20, 4, 6, 1);
		System.out.println("***************GREEN APPLE***************");
		System.out.println(objGreen);

	}

}
