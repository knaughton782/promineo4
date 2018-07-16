package weekFourHomework;

public class ResearchWkFour {

	public static void main(String[] args) {
		/*
		 * Research the differences between Lists, Sets, and Maps in Java. Find different types of each 
		 * (List, Set, Map) and research when you would use each implementation, or when a specific 
		 * implementation is  better than another. Document your findings.
		 * 
		 /*
		 * List:
		 * 		collection of objects and data 
		 * 		(dog to animal)
		 * 		allows duplicates
		 * 		order elements added become index number
		 * 		also allows for null values
		 * 		common implementations: ArrayList, LinkedList, Vector
		 * 
		 * ArrayList: 	Provides random access with index number, dynamic resizing
		 * LinkedList: 	More suitable for frequently adding/removing elements from the list. Sequential access
		 *  			of elements.
		 * Vector: 		Vector is similar with ArrayList, but it is synchronized.
		 * 
		 * Set: 
		 * 		collection of objects and data
		 * 		does not allow duplicates
		 * 		does not keep or guarantee order of elements: unordered
		 * 		does allow null
		 * 		common implementations: HashSet, LinkedHashSet, TreeSet
		 * 		methods: add(), contains(), isEmpty(), remove(), size(), 
		 * 
		 * HashSet:			A HashSet is unordered and unsorted Set.
		 * LinkedHashSet:	The only difference between HashSet and LinkedHashSet is that LinkedHashSet 
		 * 					maintains the insertion order.
		 * TreeSet:			The ordering of the elements is maintained by a set using their natural 
		 * 					ordering whether or not an explicit comparator is provided.
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
		 * HashMap:			The purpose of a map is to store items based on a key that can be used to 
		 * 					retrieve the item at a later point. Order of items is not guaranteed.
		 * LinkedHashMap:	Use LinkedHashMap, if you need to maintain insertion or access order of 
		 * 					mappings e.g. in LRU Cache. Use TreeMap, if you need to maintain mappings 
		 * 					in a sorted order, either in their natural order or a custom order defined 
		 * 					by Comparator and use HashMap for all your general purpose hashing based 
		 * 					collection requirement
		 * Hashtable:		It is similar to HashMap, but is synchronised, stores key/value pair in hash table, 
		 * 					specify an object that is used as a key, and the value we want to associate to that key. 
		 * 					The key is then hashed, and the resulting hash code is used as the index at which the 
		 * 					value is stored within the table.
		 * TreeMap: 		Use a treemap when space is constrained and you have a large amount of hierarchical data 
		 * 					that you need to get an overview of. Treemaps should primarily be used with values that can be aggregated.


		 * 
		 * 
		 * In addition, include a line of code that shows how to instantiate each of 
		 * the following:
		 * ArrayList of type String:            List<String> str = new ArrayList<String>();
		 * HashSet of type StringBuilder:		Set<StringBuilder> sb = new HashSet<StringBuilder>();
		 * HashMap of type String, String:		Map<String, String> = new HashMap<String, String>();
		 * 
		 * http://www.java67.com/2013/01/difference-between-set-list-and-map-in-java.html
		 * https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist
		 * https://dzone.com/articles/arraylist-vs-linkedlist-vs
		 * https://stackoverflow.com/questions/5080612/hashset-vs-linkedhashset
		 * https://www.geeksforgeeks.org/treeset-in-java-with-examples/
		 * https://stackoverflow.com/questions/7975802/when-to-use-hashmap-over-linkedlist-or-arraylist-and-vice-versa
		 * https://javarevisited.blogspot.com/2015/08/difference-between-HashMap-vs-TreeMap-vs-LinkedHashMap-Java.html
		 * https://www.geeksforgeeks.org/java-util-hashtable-class-java/
		 * https://help.qlik.com/en-US/sense/September2017/Subsystems/Hub/Content/Visualizations/TreeMap/when-to-use-treemap.htm
		 * 
		 */
	}

}
