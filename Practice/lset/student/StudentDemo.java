package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentDemo {
	static ArrayList<Student> studentReport = new ArrayList<Student>();
	public static void main(String[] args) {
		int choice;
		Scanner reader = new Scanner(System.in);
		System.out.println("This is a Student Program");
		
		while (true) {
			System.out.println("\n_______________________________________________________");
			System.out.println("Please Enter Your Choice");
			System.out.println("1. Add Student");
			//edit student, write to file , read from file 
			System.out.println("2. Delete Student");
			System.out.println("3. Show Report");
			System.out.println("4. Exit");
			System.out.println("\n_______________________________________________________");

			System.out.println("Choice");
			choice = reader.nextInt();

			System.out.println("Entered Choice = " + choice);


			switch (choice) {
			case 1:
				addStudent();
				break;

			case 2:
				deleteStudent();
				break;

			case 3:
				showReport();
				break;

			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}
	
	private static void addStudent() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Please Enter Student Data");
		Student student = new Student();
		
		System.out.println("Student Name ");
		student.studentName = reader.next();
		System.out.println("Student RollNumber ");
		student.rollNumber = reader.nextInt();

		System.out.println("Student Marks1 ");
		student.marks1 = reader.nextInt();

		System.out.println("Student Marks2 ");
		student.marks2 = reader.nextInt();

		System.out.println("Student Marks3 ");
		student.marks3 = reader.nextInt();
		
		student.totalMarks = student.marks1 + student.marks2 + student.marks3;

		studentReport.add(student);

	}
	
	private static void deleteStudent() {
		boolean foundRecord = false;
		Scanner reader = new Scanner(System.in);

		System.out.println("Please Enter Student RollNumber for StudentRecord Deletion");
		
		System.out.println("Student RollNumber ");
		int rollNumber = reader.nextInt();

		for (Student student : studentReport) {
			if (student.rollNumber == rollNumber) {
				studentReport.remove(student);
				foundRecord = true;
				System.out.println("Student Record With RollNumber " + rollNumber + " Successfully Removed");
				break;
			}
		}
		
		
		if (foundRecord == false) {
			System.out.println("Sorry There Is No Record With This Roll Number");
		} 
	}

	private static void showReport() {
		System.out.println("Student Report Database");
		Collections.sort(studentReport);
		
		System.out.println("StudentName" + "\t" + "RollNumber" + "\t" + "Marks1" + "\t" + "Marks2" + "\t" + "Marks3" + "\t" + "TotalMarks" + "\t" + "Rank");
		int rank = 1;
		for (Student student : studentReport) {
			System.out.println(student + "\t\t" + rank++);
		}
		
	}

}
