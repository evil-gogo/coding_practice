package dictionary;

public class Meaning implements Comparable<Meaning> {
	private String Meaning;
	private int meaningCount;
	
	public String getMeaning() {
		return Meaning;
	}
	
	public void setMeaning(String meaning) {
		Meaning = meaning;
	}
	
	public int getMeaningCount() {
		return meaningCount;
	}
	
	public void setMeaningCount(int meaningCount) {
		this.meaningCount = meaningCount;
	}

	@Override
	public int compareTo(Meaning o) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
}
