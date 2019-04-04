package accolite;

import java.util.HashMap;

class TwoMap {
	HashMap<String, Integer> forwardMap = new HashMap<>();
	HashMap<Integer ,String > backMap = new HashMap<>();
	public void add(String name, int id) {
		forwardMap.put( name, id);
		backMap.put(id, name);
	}
	
	public int getByKey(String name){
		return forwardMap.get(name);
	}
	
	public String getByValue(int id){
		return backMap.get(id);
	}
}

public class TwoWayHashMapDemo {
	public static void main(String[] args) {
		TwoMap ins = new TwoMap();
		ins.add("lalit", 1);
		ins.add("lalit", 2);
		ins.add("gagan", 3);

		ins.add("asif", 2);
		System.out.println(ins.getByKey("lalit"));
		System.out.println(ins.getByValue(2));
	}
}