package yashna;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day1{
	public static void main(String args[]) throws IOException{
		FileOutputStream fout = new FileOutputStream("E:/eMBMS_WorkSpace/JAVAPractice/LSET/Yashna/STUPID.txt", false);
		System.out.println("User, Enter what you want to write to the file!");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i<str.length();i++){
			fout.write(ch[i]);
			System.out.print(ch[i]);
			System.out.print("\n");
		}
		fout.close();

		int h;
		FileInputStream fin = new FileInputStream("E:/eMBMS_WorkSpace/JAVAPractice/LSET/Yashna/STUPID.txt");
		do {
			h=fin.read();
			System.out.print((char)h);
		} while (h != -1);
		fin.close();
		System.out.print("gsgdf");
	}
}