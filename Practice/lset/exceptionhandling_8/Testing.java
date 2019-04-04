package exceptionhandling_8;

public class Testing {
	int count = 0;
	

	void A() throws Exception {
		try {
			count++;
			try {
				count++;
				
				try {
					count++;
					throw new Exception() ;
				} catch (Exception e) {
					count++;
					throw new Exception();
				}
				
			} catch (Exception e) {
				count++;
			}
		} catch (Exception e) {
			count++;
		} 
	}
	
	void display() {
		System.out.println(count);
	}

	
	public static void main(String[] args) throws Exception {
		Testing obj = new Testing();
		obj.A();
		obj.display();
	}
}