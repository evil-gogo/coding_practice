package codingbat;

import java.util.ArrayList;

class Animal {
	
}


class Dog extends Animal {
	
}

public class Testing {
	public static void main(String[] args) {
		String str = "gagan";
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(new Animal());
		al.add(new Animal());
		al.add(new Dog());
		
		
		for (Animal animal : al) {
			System.out.println("For Each Values " +  animal);
		}
		
		
		modify(al);
		
	/*	for (Animal animal : al) {
			System.out.println("Values" + animal);
		}*/
		
		for (int i = 0 ;i < al.size(); i++) {
			System.out.println("For Loop " + i + " " + al.get(i) );
		}
	}

	private static void modify(ArrayList al) {
		// TODO Auto-generated method stub
		al.add(2);
		for (int i = 0 ;i < al.size(); i++) {
			System.out.println("Modify For Loop " + i + " " + al.get(i) );
		}
	}
}

