package A;

public class DynamicBindingDemo {

	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());

	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}
	
	static class GraduateStudent extends Student{//static!!静态不能调用动态
	}
	
	static class Student extends Person{
		@Override
		public String toString() {
			return "Student";
		}
		}
	
	static class Person extends Object{
		@Override
		public String toString() {
			return "Person";
		}
	}
}
