package studentfileio;

public class Student implements Comparable<Student>{
	String studentName;
	int rollNumber;
	int marks1;
	int marks2;
	int marks3;
	int totalMarks;

		
	@Override
	public String toString() {
		return studentName + "\t\t" + rollNumber + "\t\t" + marks1 + " \t" +  marks2 + "\t" +  marks3 + " \t" +  totalMarks; 
	}

	@Override
	public int compareTo(Student o) {
		return o.totalMarks - totalMarks;
	}

}
