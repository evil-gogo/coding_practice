package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> treeSetStudent = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				o1.studentName.compareTo(o2.studentName);
				return 0;
				
			}
		});
		
		
		treeSetStudent.add(new Student("abc"));
		treeSetStudent.add(new Student("bcd"));
		treeSetStudent.add(new Student("xyz"));
		treeSetStudent.add(new Student("mno"));
		
		
	}
}
