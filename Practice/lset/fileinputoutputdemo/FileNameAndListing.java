package fileinputoutputdemo;

import java.io.File;
import java.util.ArrayList;

public class FileNameAndListing {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		//Gets the current project directory
		String projectPath = new File("").getAbsolutePath();

		System.out.println("Project Directory : " + projectPath);

		//Lists all the directories and files inside the project directory using recursive
		getFilePath(list, projectPath);

		for (String string : list) {
			System.out.println(string);
		}

	}
	private static void getFilePath(ArrayList<String> list, String projectPath) {
		if(new File(projectPath).isDirectory()) {
			list.add("Directory >>> " + new File(projectPath).getName());
		}

		
		File[] files = new File(projectPath).listFiles();

		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				getFilePath(list, files[i].getAbsolutePath());
			} else {
				list.add(files[i].getAbsolutePath());
			}
		}
	}
}
