package instanceofbasics;

interface Colorable { 
	
}

interface Bouncable extends Colorable {
	
}

class QWE implements Bouncable { 
	
}

class QWESub extends QWE {
	
}

class qaz {
	
}

public class BTQ5 {

	public static void main(String[] args) {
		System.out.println(new QWESub() instanceof Colorable);
		System.out.println(new QWESub() instanceof QWE);
		System.out.println(new QWE() instanceof QWESub);
		System.out.println(new qaz() instanceof Bouncable);

	}

}