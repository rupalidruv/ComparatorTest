package coustom.sorting.practice;

import java.util.*;

public class EmpTest {
	public static void main(String[] args) {
		Employee e1=new Employee(70,"Neha","Account");
		Employee e2=new Employee(50,"Sneha","Marketing");
		Employee e3=new Employee(62,"Deepa","HR Dept");
		Employee e4=new Employee(39,"Shewta","Development");
		
		TreeSet t=new TreeSet(new EmpIdAscending());
		TreeSet t=new TreeSet(new EmpIdDescending());
		TreeSet t=new TreeSet(new EmpNameAscending());
		TreeSet t=new TreeSet(new EmpNameDescending());
		TreeSet t=new TreeSet(new EmpDeptAscending());
		TreeSet t=new TreeSet(new EmpDeptDescending());	
		t.add(e1);
		t.add(e3);
		t.add(e2);
		t.add(e4);
		System.out.println(t);
	}
}