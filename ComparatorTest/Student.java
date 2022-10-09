import java.util.Objects;

public class Student implements Comparable<Student>{
	Integer roll;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(roll, other.roll);
	}
	

	public Student(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [roll " + roll + ", name " + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.roll.compareTo(o.roll);
	}
	
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
}