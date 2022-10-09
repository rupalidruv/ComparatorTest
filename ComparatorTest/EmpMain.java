import java.util.Objects;

public class Employee {
	Integer id;
	String name,dept;
	
	
	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public int hashCode() {
	return Objects.hash(id,name,dept);
	}
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee other=(Employee)obj;
		return this.id==other.id && this.name.equals(other.name) && this.dept.equals(other.dept);
	}
	public String toString() {
		return "Employee[name  "+name+",id  "+id+",dept  "+dept+"]";
		
	}
	
}