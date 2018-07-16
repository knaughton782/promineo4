package weekFourHomework;
/*
*In a different class, create an ArrayList, HashSet, and HashMap.
* Add at least three entries to each collection.
* Iterate over each collection and print out the contents.
*/

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalListSetMap {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList<String>();
		cars.add("Tacoma");
		cars.add("Jeep");
		cars.add("Nissan");
		
		for (String car : cars) {
			System.out.println(car);
		}
		
		
		Set<String> foods = new HashSet<String>();
		foods.add("Spaghetti");
		foods.add("Guacamole");
		foods.add("Tacos");
		
		for (String food : foods) {
			System.out.println(food);
		}
		
		Map<Integer, String> grades = new HashMap<Integer, String>();
		grades.put(1, "Algebra");
		grades.put(2, "English");
		grades.put(3, "Spanish");
		
		System.out.println(grades.get(1));
		System.out.println(grades.get(2));
		System.out.println(grades.get(3));
	}
	
	
	

}
