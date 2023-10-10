package strings;

public class ReccursiveStringDemo {

	public static void main(String[] args) {
		String s = "I LOVE MY INDIA";
		String reversed = reverseString(s);
		System.out.println("Original string: " + s);
		System.out.println("Reversed string: " + reversed);
	}
	
	 public static String reverseString(String input) {
	        // Base case: if the input string is empty or has only one character,
	        // it is already reversed, so return it as is.
	        if (input == null || input.length() <= 1) {
	            return input;
	        }

	        // Recursive case: reverse the substring excluding the first character,
	        // and concatenate the first character at the end.
	        return reverseString(input.substring(1)) + input.charAt(0);
	    }

}
