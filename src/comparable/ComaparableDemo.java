package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		return this.age > that.age ? 1 : -1; // Ternary Operator

//		if(this.age>that.age ) {
//			return 1;
//		}else {
//			return -1;
//		}

	}

}

public class ComaparableDemo {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList<>();

		studs.add(new Student(34, "Ram"));
		studs.add(new Student(25, "Vishal"));
		studs.add(new Student(18, "Akshay"));
		studs.add(new Student(31, "Sujit"));

		Collections.sort(studs);
		studs.forEach(n -> System.out.println(n));

	}

}
