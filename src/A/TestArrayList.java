package A;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList=new ArrayList<String>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		System.out.println("List size?"+cityList.size());
		System.out.println("Is London here?"+cityList.contains("London"));
		System.out.println("The location of Denver?"+cityList.indexOf("Denver"));
		System.out.println("List is empty?"+cityList.isEmpty());
		
	}

}
