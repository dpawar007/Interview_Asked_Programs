package strings;

public class ReverseWordsInStringUsingSplit {
	public static void main(String[] args) {
		String input = "I LOVE MY INDIA";
		String reversed = reverseWords(input);
		System.out.println("Original string: " + input);
		System.out.println("Reversed string: " + reversed);
	}

	public static String reverseWords(String input) {
		// Split the input string into words using space as the delimiter
		String[] words = input.split(" ");

		// Create a StringBuilder to build the reversed string
		StringBuilder reversedString = new StringBuilder();

		// Reverse the order of words and append them to the StringBuilder
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]);
			if (i > 0) {
				// Add a space between words (except before the first word)
				reversedString.append(" ");
			}
		}

		return reversedString.toString();
	}

}
