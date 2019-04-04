package staticinitializervsnonstaticinitializervsvonstructor_1;
public class Falcon extends Bird {
	Falcon() {
		System.out.print("Falcon ");
	}
	public static void main(String[] args) {
		System.out.print("main ");
		new Falcon();
	}
}