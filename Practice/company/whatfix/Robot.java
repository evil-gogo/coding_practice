package whatfix;

public class Robot {
	static int noOfWays = 0;
	public static void main(String[] args) {
		boolean[][] grid = new boolean [4][4];
		grid[0][0] = true;
		start(0, 1, grid);
		System.out.println("The number of unique ways for the robot to reach its destination is -> " + noOfWays);
	}

	private static void start(int x, int y, boolean[][] grid){
		grid[x][y] = true;
		moveUp(x, y, grid);
		moveDown(x, y, grid);     
		moveLeft(x, y, grid);     
		moveRight(x, y, grid);         
	}

	private static void moveUp(int x, int y, boolean[][] grid) {
		if (y == 0) { 
			return;
		} else {
			if (grid[x][y - 1]) { 
				return;
			}
			grid[x][y - 1] = true;
			start(x, y - 1, grid);
			grid[x][y - 1] = false;
		}
	}
	
	private static void moveLeft(int x, int y, boolean[][] grid) {
		if (x == 0) 
			return;
		else {
			if (grid[x - 1][y]) { 
				return;
			}
			grid[x - 1][y] = true;
			start(x - 1, y, grid);
			grid[x - 1][y] = false; 
		}
	}

	private static void moveDown(int x, int y, boolean[][] grid) {
		if (x == 3 && y == 3) {
			noOfWays++;
			grid[x][y] = true;
			return;
		} else {
			if (y == 3) {
				return;
			} else {
				if (grid[x][y + 1]) 
					return;
				grid[x][y + 1] = true;
				start(x, y + 1, grid);
				grid[x][y + 1] = false;
			}
		}
	}

	private static void moveRight(int x, int y, boolean[][] grid) {
		if (x == 3 && y == 3) {
			noOfWays++;
			grid[x][y] = true;
			return;
		} else {
			if (x == 3) { 
				return;
			} else {
				if (grid[x + 1][y]) { 
					return;
				}
				grid[x + 1][y] = true;
				start(x + 1, y, grid);
				grid[x + 1][y] = false; 
			}
		}
	}
}