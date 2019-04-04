package stringvsstringbuffer;

class StringVsStringBuffer {

	public void method(StringBuffer sb){
		System.out.println("StringBuffer Verion");
	}
	public void method(String s){
		System.out.println("String Version");
	}
	public static void main(String args[]){
		StringVsStringBuffer question = new StringVsStringBuffer();
		//Uncomment question.method(null); //error does not compile
	}
}
