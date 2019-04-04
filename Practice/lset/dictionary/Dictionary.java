package dictionary;

import java.util.Scanner;

public class Dictionary<E extends Comparable<E>> {
	private static MyLinkedList<Word> myList = new MyLinkedList<Word>();
	
	//private static MyLinkedList< MyLinkedList<Word> > myDictionary= new MyLinkedList<MyLinkedList<Word>>();
	public static void main(String[] args) {
		
		int choice;
		Scanner reader = new Scanner(System.in);
		System.out.println("This is a Dictionary Program");


		while (true) {
			System.out.println("\n_______________________________________________________");
			System.out.println("Please Enter Your Choice");
			System.out.println("1. Search Word Meaning");
			System.out.println("2. Add Word");
			System.out.println("3. Delete Word");
			System.out.println("4. Exit");
			System.out.println("\n_______________________________________________________");

			System.out.println("Choice");
			choice = reader.nextInt();

			System.out.println("Entered Choice = " + choice);


			switch (choice) {
			case 1:
				searchWordMeaning();
				break;

			case 2:
				addWord();
				break;

			case 3:
				deleteWord();
				break;

			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	private static void deleteWord() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter a Word to Delete");
		String word = reader.next();
		//Node list = getList(calculateIndex(word));
		Word data = new Word();
		data.setWordName(word);
		myList.deleteNode(data);
	
	}

	private static void searchWordMeaning() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter a Word to Search");
		String word = reader.next();
		//Node list = getList(calculateIndex(word));
		Word data = new Word();
		data.setWordName(word);
		myList.searchNode(data);
		myList.get(3);
	}

	private static void addWord() {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter a Word");
		String inputWord = reader.next();
		Word data = new Word();
		data.setWordName(inputWord);
		
		myList.addNode(data);
		
		
	/*	Node<MyLinkedList<Word>> list = myDictionary.get(calculateIndex(inputWord));
		
		list.ad
		if (list == null) {
			list = new Node(word);
		} else {
			list.addNode(word);
		}
		
		
		myDictionary[calculateIndex(inputWord)]
		myDcalculateIndex(inputWord);
		myDictionary.get(calculateIndex(inputWord)).addNode(createNewNode(data));
		
		
		myDictionary.addNode(createNewNode(data));
		
		Node list = getList(calculateIndex(word));
		if (list == null) {
			list = new Node(word);
		} else {
			list.addNode(word);
		}
*/	}

	

	private static int calculateIndex(String word) {
		char firstChar = word.toUpperCase().charAt(0);
		int index = firstChar - 'A';
		System.out.println("Index " + index);
		return index;
	}
	
	/*private static Node<MyLinkedList<Word>> getList(int index) {
		return myDictionary.get(index);
	}*/
	/*private static MyLinkedList <MyLinkedList<Word>> get(int index) {
		return myDictionary.get(index);
	}*/
}
