package yashna;

class Mixer {
	Mixer() {

	}

	Mixer(Mixer m) {
		m1 = m;
	}

	public Mixer m1;

	public static void main(String s[]) {
		Mixer m2 = new Mixer();
		Mixer m3 = new Mixer(m2);
		m3.go();
		Mixer m4 = m3.m1;
		//Mixer m5= new Mixer();
		m4.go();
		//Mixer m5 = new Mixer(m2.m1);
		//Mixer m5 = new Mixer();
		//Mixer m5 = new Mixer(m2);
		//Mixer m5 = new Mixer(m3);
		//Mixer m5 = m3;
		Mixer m5 = m3.m1;
		m5.go();
		m5.go();
		//m2.go();
	}

	void go() {
		System.out.print("hi ");
	}
}