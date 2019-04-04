package packageex_packageB;

import packageex_packageA.ClassA;

public class ClassB {
	public static void main(String[] args) {
		ClassA classAObj = new ClassA();
		//https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
		//System.out.print(" " + classAObj.a);
		//System.out.print(" " + classAObj.b);
		System.out.print(" " + classAObj.c);
	}
}
