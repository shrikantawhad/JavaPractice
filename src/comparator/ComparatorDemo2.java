package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}

}

public class ComparatorDemo2 {
	public static void main(String[] args) {

		List<Student> studs = new ArrayList<>();

		studs.add(new Student(32, "Ram"));
		studs.add(new Student(23, "Vishal"));
		studs.add(new Student(12, "Sujit"));
		studs.add(new Student(25, "Akshay"));
		studs.add(new Student(18, "Prathamesh"));

		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				if ((o1.name).length() > (o2.name).length()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		
		Collections.sort(studs,com);
		studs.forEach(n -> System.out.println(n));
		// System.out.println(studs);

		// Collections.sort(studs);

	}

}
