package fileinputoutputdemo;

import java.io.File;

public class FileRoots {
	public static void main(String[] args) {
		File file = new File(new File("").getAbsolutePath());
		System.out.println(file.getAbsolutePath());
		System.out.println("Prints only file names >>> ");
		String[] files = file.list();
		for (String string : files) {
			System.out.println(string);
		}

		System.out.println("Files with absolute paths >>> ");
		File[] files2 = file.listFiles();
		for (File file2 : files2) {
			System.out.println(file2.getAbsolutePath());
		}

		System.out.println("Roots >>> ");
		File[] files3 = file.listRoots();
		for (File file2 : files3) {
			System.out.println(file2.getAbsolutePath());
		}
	}
}
