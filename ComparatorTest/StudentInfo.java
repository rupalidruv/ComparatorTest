import java.util.TreeSet;

public class StudentInfo {
	public static void main(String[] args) {
		Student s1=new Student(33,"ZZZ");
		Student s2=new Student(11,"XXX");
		Student s3=new Student(22,"YYY");

		TreeSet t=new TreeSet();

		t.add(s2);
		t.add(s3);
		t.add(s1);
		
		System.out.println(t);
	}
}
