package dictionary;

public class Word implements Comparable<Word> {
	private String wordName;
	private MyLinkedList<Meaning> meaning;
	
	public String getWordName() {
		return wordName;
	}
	
	public void setWordName(String wordName) {
		this.wordName = wordName;
	}
	
	public MyLinkedList<Meaning> getMeaning() {
		return meaning;
	}

	public void setMeaning(MyLinkedList<Meaning> meaning) {
		this.meaning = meaning;
	}

	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals");
		if (obj instanceof Word ) {
			//System.out.println("equals returns " + getWordName().equals(((Word) obj).getWordName()));
			return getWordName().equals(((Word) obj).getWordName());
		}
		//System.out.println("equals returns false" );
		return false;
	}

	@Override
	public int compareTo(Word o) {
		System.out.println("this.getWord " + getWordName());
		System.out.println("0.getWord " + o.getWordName());
		System.out.println("compareToReturns " + getWordName().compareTo(o.getWordName()));
		return getWordName().compareTo(o.getWordName());
	}

	@Override
	public String toString() {		
		return getWordName();
	}
}
