package onmobile;

import java.util.NoSuchElementException;

public class PrefixToPostfixUserStack {
	public static void main(String[] args) {
		String prefixExp = "-*+ABC*-DE+FG";
		MyStack st = new MyStack(prefixExp.length());
		int l = prefixExp.length();
		String t1, t2;
		for (int i = l - 1; i >= 0; i--) {
			if (isOperator(prefixExp.charAt(i))) {
				t1 = st.peek();		
				st.pop();
				t2 = st.peek();
				st.pop();
				t2 += prefixExp.charAt(i);
				st.push(t1 + t2);
			} else {
				t1 = "";
				t1 += prefixExp.charAt(i);
				st.push(t1);
			}
		}
		
		String postfix = st.peek();		
		st.pop();
		System.out.println(postfix);
	}

	static boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return true;
		}
		return false;
	}

}
class MyStack {
	protected String arr[];
	protected int top, size, len;

	public MyStack(int n){
		size = n;
		len = 0;
		arr = new String[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size -1 ;        
	}

	public int getSize() {
		return len ;
	}

	public String peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return arr[top];
	}

	public void push(String str) {
		if (top + 1 >= size) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		if (top + 1 < size ) {
			arr[++top] = str;
		}
		len++;
	}

	public String pop() {
		if (isEmpty()){
			throw new NoSuchElementException("Underflow Exception");
		}
		len-- ;
		return arr[top--]; 
	}    

	public void display() {
		System.out.print("\nStack = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return ;
		}
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " "); 
		}
		
		System.out.println();
	}    

}

