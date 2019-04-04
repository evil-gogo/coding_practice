package enums;

enum Fruit {
	Apple, Orange, Grape;
	
	int price;
	private Fruit() { // the constructor of an enum should always be private
		// TODO Auto-generated constructor stub
	}
	
	private Fruit(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}

public class EnumDemo {
	public static void main(String[] args) {
		//Fruit f;

		/*switch (f) {
		case Orange:

			break;

		case Grape:

			break;

		default:
			break;
		}*/
		
		System.out.println(Fruit.Apple.ordinal());
		System.out.println(Fruit.Apple.valueOf("Orange"));
		System.out.println(Fruit.Apple.valueOf("Apple"));
		//System.out.println(Fruit.Apple.valueOf("Oranges"));
		Fruit[] f = Fruit.Apple.values();
		for (Fruit fruit : f) {
			System.out.println(fruit);
		}
		
		System.out.println(Fruit.Apple.getPrice());
		
		
	}	
}
