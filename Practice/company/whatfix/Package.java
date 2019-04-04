package whatfix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Package {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the path of the File ");
		String pathToFile = scanner.nextLine();

		File file = new File(pathToFile);

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String inputLine = "";
		try {
			while(true) {
				inputLine = scanner.nextLine();
				doPackaging(inputLine);
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.exit(0);
		}
	}

	private static void doPackaging(String inputLine) {
		ArrayList<Item> optimalChoiceList = new ArrayList<>();
		String[] inputLine_Split = inputLine.split(" : ");
		String[] items_Split;
		String itemInfo;
		String[] itemInfo_Split;
		float weight = Float.parseFloat(inputLine_Split[0]);
		items_Split = inputLine_Split[1].split(" ");
		ArrayList<Item> itemList = new ArrayList<>();

		for (int i = 0; i < items_Split.length; i++) {
			itemInfo = items_Split[i].substring(1, items_Split[i].length() - 1);
			itemInfo_Split = itemInfo.split(",");
			Item item = new Item();
			item.setIndexNumber(Integer.parseInt(itemInfo_Split[0]));
			item.setWeight(Float.parseFloat(itemInfo_Split[1]));
			item.setCost(Integer.parseInt(itemInfo_Split[2].substring(1)));
			itemList.add(item);
		}

		fillPackage(weight, itemList, optimalChoiceList, itemList.size());
		for (int i = 0; i < optimalChoiceList.size(); i++) {
			System.out.print(optimalChoiceList.get(i).getIndexNumber());
			if (optimalChoiceList.size() > 1 && i != optimalChoiceList.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	private static int fillPackage(float weight,  ArrayList<Item> itemList, ArrayList<Item> optimalChoiceList, int n){
		if (n == 0 || weight == 0) {
			return 0;
		}
		
		if (itemList.get(n - 1).getWeight() > weight) {
			ArrayList<Item> subOptimalChoice = new ArrayList<>();
			int optimalCost = fillPackage(weight, itemList, subOptimalChoice, n - 1);
			optimalChoiceList.addAll(subOptimalChoice);
			return optimalCost;
		} else {
			ArrayList<Item> includeOptimalChoice = new ArrayList<>();
			ArrayList<Item> excludeOptimalChoice = new ArrayList<>();
			int includeCost = itemList.get(n - 1).getCost() + fillPackage((weight - itemList.get(n - 1).getWeight()), itemList, includeOptimalChoice, n - 1);
			int excludeCost = fillPackage(weight, itemList, excludeOptimalChoice, n - 1);
			
			if (includeCost > excludeCost) {
				optimalChoiceList.addAll(includeOptimalChoice);
				optimalChoiceList.add(itemList.get(n - 1));
				return includeCost;
			} else {
				optimalChoiceList.addAll(excludeOptimalChoice);
				return excludeCost;
			}
		}
	}


}