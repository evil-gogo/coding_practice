package trie;

import java.util.*;

class TrieNode {
	char content; 
	boolean isEnd; 
	int count;  
	LinkedList<TrieNode> childList; 

	public TrieNode(char c) {
		childList = new LinkedList<TrieNode>();
		isEnd = false;
		content = c;
		count = 0;
	}  

	public TrieNode subNode(char c) {
		if (childList != null) {
			for (TrieNode child : childList) {
				if (child.content == c) {
					return child;
				}
			}
		}
		return null;
	}
}

class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode(' '); 
	}

	public void insert(String word) {
		if (search(word) == true) {
			return;        
		}
		TrieNode current = root; 
		for (char ch : word.toCharArray()) {
			TrieNode child = current.subNode(ch);
			if (child != null) {
				current = child;
			} else {
				current.childList.add(new TrieNode(ch));
				current = current.subNode(ch);
			}
			current.count++;
		}
		current.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode current = root;  
		for (char ch : word.toCharArray()) {
			if (current.subNode(ch) == null) {
				return false;
			} else {
				current = current.subNode(ch);
			}
		}      
		if (current.isEnd == true) { 
			return true;
		}
		return false;
	}

	public void remove(String word) {
		if (search(word) == false) {
			System.out.println(word + " does not exist in trie\n");
			return;
		}             
		TrieNode current = root;
		for (char ch : word.toCharArray()) { 
			TrieNode child = current.subNode(ch);
			if (child.count == 1) {
				current.childList.remove(child);
				return;
			} else {
				child.count--;
				current = child;
			}
		}
		current.isEnd = false;
	}
}    

public class TrieDemo {
	public static void main(String[] args) {            
		Scanner scanner = new Scanner(System.in);
		
		Trie t = new Trie(); 
		System.out.println("Trie Demo\n");          
		char ch;
		
		do {
			System.out.println("\nTrie Operations\n");
			System.out.println("1. Insert ");
			System.out.println("2. Delete");
			System.out.println("3. Search");

			int choice = scanner.nextInt();            
			switch (choice) {
			case 1 : 
				System.out.println("Enter string element to insert");
				t.insert(scanner.next());                     
				break;                          
		
			case 2 : 
				System.out.println("Enter string element to delete");
				try {
					t.remove(scanner.next()); 
				} catch (Exception e) {
					System.out.println(e.getMessage() + " not found ");
				}
				break;                         
			
			case 3 : 
				System.out.println("Enter string element to search");
				System.out.println("Search result : " + t.search(scanner.next()));
				break;
				
			default : 
				System.out.println("Wrong Entry \n ");
				break;   
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scanner.next().charAt(0);                        
		} while (ch == 'Y'|| ch == 'y');               
	}
}