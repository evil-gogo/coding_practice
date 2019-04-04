package whatfix;

public class Item {
	private int indexNumber;
	private float weight;
	private int cost;
	
	public int getIndexNumber() {
		return indexNumber;
	}
	
	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Index " + indexNumber + " | " + "Weight " + weight + " | " + "Cost " + cost;
	}
}
