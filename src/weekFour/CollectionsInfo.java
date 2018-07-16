package weekFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsInfo {

	public static void main(String[] args) {
		/*
		 * List:
		 * 		collection of objects and data 
		 * 		(dog to animal)
		 * 		allows duplicates
		 * 		order elements added become index number
		 * 		also allows for null values
		 * 		common implementations: ArrayList, LinkedList, Vector
		 * 
		 * Set: 
		 * 		collection of objects and data
		 * 		does not allow duplicates
		 * 		does not keep or guarantee order of elements: unordered
		 * 		does allow null
		 * 		common implementations: HashSet, LinkedHashSet, TreeSet
		 * 		methods: add(), contains(), isEmpty(), remove(), size(), 
		 * 
		 * Map: 
		 * 		collection of objects and data
		 * 		adds 2 element in each entry: key value pairs
		 * 		first value = key, second value = actual value
		 * 		values can be duplicated, but not keys
		 *   	if its ordered depends on how you use it
		 *   	common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 *   	methods: get(), isEmpty(), remove(), size(), values(), keySet(),
		 *   	signature: Map<K, V> K is the key, V is the value
		 * 		
		 * 
		 * 
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Bob");
		students.add("Bob");
		students.add("Robert");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student); //allows duplicate values
		}
		System.out.println(students.get(2));
		System.out.println(students.get(1));
		
		
		
		Set<String> states = new HashSet<String>();
		states.add("Texas");
		states.add("Texas");
		states.add("Nevada");
		states.add("Arizona");
		states.add("California");
		
		for (String state : states) {
			System.out.println(state);
			System.out.println(states);
			System.out.println(states.size());
		}
		
		Map<Integer, String> teamNumbers = new HashMap<Integer, String>();
		teamNumbers.put(1, "James");
		teamNumbers.put(2, "Susan");
		teamNumbers.put(3, "William");
		
		System.out.println(teamNumbers.get(1));
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augument", "Increase in size");
		dictionary.put("Diminish", "Decrease in size");
		dictionary.put("Pride", "Goes before a fall");
		
		
	
		
	}

}
