package weekFour;


public class PracticeStringBuilder {

	public static void main(String[] args) {
		String firstName = "Sally";
		String lastName = "Smith";
		
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//concat takes the place of the addition operator but doesn't actually change the value
		//unless you reassign the value
		/* strings are immutable....unchangeable
		 * all the Strings will exist in memory(memory leak)
		 * only use Strings when you have a value that won't be changing a lot
		 * for a lot of building or changing use StringBuilder
		 */
		System.out.println(firstName.concat(lastName));
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		} return result.toString();
	}
}
