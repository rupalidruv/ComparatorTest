import java.util.Comparator;
public class EmpDeptAscending implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e1.dept.compareTo(e2.dept); 
	}

}

import java.util.Comparator;
public class EmpDeptDescending implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e2.dept.compareTo(e1.dept);
	}

}


import java.util.Comparator;
public class EmpIdAscending implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e1.id.compareTo(e2.id);
		
	}

}

import java.util.Comparator;
public class EmpIdDescending implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e2.id.compareTo(e1.id);
		
	}

}


import java.util.Comparator;
public class EmpNameAscending implements Comparator {
	public int  compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e1.name.compareTo(e2.name) ;
	}

}

import java.util.Comparator;
public class EmpNameDescending implements Comparator {
	public int  compare(Object obj1,Object obj2) {
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		return e2.name.compareTo(e1.name) ;
	}

}