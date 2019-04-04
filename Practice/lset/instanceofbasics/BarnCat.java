package instanceofbasics;

class Robot {

}

interface Animal {

}

class Feline implements Animal {

}


public class BarnCat extends Feline {
	public static void main(String[] args) {

		Animal af = new Feline();
		Feline ff = new Feline();
		BarnCat b = new BarnCat();
		Robot r = new Robot();
		if (af instanceof Animal)
			System.out.println("1");

		if (af instanceof BarnCat)
			System.out.println("2");

		if (b instanceof Animal)
			System.out.println("3");

		if (ff instanceof BarnCat)
			System.out.println("4");

		if (r instanceof Animal)
			System.out.println("5");

	}	
}
