package day02;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.num = 1001;
		s.name="Jung";
		Student.study();
		s.work(10);
		
		Student s2 = new Student();
		s2.num = 1002;
		s2.name = "Hong";
		Student.study();
		s2.work(5);

	}

}
