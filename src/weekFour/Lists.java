package weekFour;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		/*array sizes have to be set up front, always have to refer to index to read/write to that index
		 * always have to keep track of what element you are at
		 * 
		 * List is similar to array but you can overcome some of array limitations
		 * List is an interface
		 * cannot create an object from a list, instead create from a class that uses list
		 * 
		 * generics: list of generic type
		 * 
		 * List<data type of list goes here>
		 * .add is method on list
		 * don't have to add index numbers, can get as large or as small as needed
		 * 
		 * signature of list is List<E> where E is the generic that will be replaced with data type
		 * 
		 * Can't use primitive data types with list...must use corresponding class: interchangeable (auto-boxing)
		 * 
		 * 
		 * methods: isEmpty(); size(); remove(); add(); .get();
		 */
		List<String> sports = new ArrayList<String>();
		sports.add("Hockey");
		sports.add("Rock Climbing");
		sports.add("Rollerblades");
		
		sports.remove(2);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<String> cars = new ArrayList<String>();
		cars.add("Mustang");
		cars.add("Tacoma");
		cars.add("Nissan");
		
		//List<Integer> nums = new ArrayList<Integer>();
	}

}
