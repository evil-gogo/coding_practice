package stack;

class MyStack {
	private int[] array;
	private int stackSize = 0;

	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	
	public MyStack(int sizeOfStack) {
		array = new int[sizeOfStack];
	}
	
	public int pop() throws MyStackUnderFlowException {
		if (stackSize == 0) {
			throw new MyStackUnderFlowException("Stack UnderFlow!!! No Items to delete");
		} else {
			int itemPopped = array[stackSize - 1];
			stackSize = stackSize - 1;
			return itemPopped;
		}

	}
	
	public void push(int item) throws MyStackOverFlowException {
		if (stackSize == array.length) {
			throw new MyStackOverFlowException("Stack OverFlow!!! Unable to Push Item " + item);
		} else {
			array[stackSize] = item;
			System.out.println("Item Pushed = " + array[stackSize]);
			stackSize = stackSize + 1;
		}
	}

	void displayStack() {
		for (int i = 0; i < stackSize; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
