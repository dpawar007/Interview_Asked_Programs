package strings;

public class ReverseWordsInStringWithoutSplit {
	public static void main(String[] args) {
		String input = "I LOVE MY INDIA";
		String reversed = reverseWords(input);
		System.out.println("Original string: " + input);
		System.out.println("Reversed string: " + reversed);
	}

	public static String reverseWords(String input) {
		StringBuilder reversedString = new StringBuilder();
		StringBuilder currentWord = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == ' ') {
				// When a space is encountered, add the current word to the result in reverse
				// order
				if (currentWord.length() > 0) {
					if (reversedString.length() > 0) {
						reversedString.insert(0, ' ');
					}
					reversedString.insert(0, currentWord);
					currentWord.setLength(0);
				}
			} else {
				// Append the current character to the current word
				currentWord.append(c);
			}
		}

		// Add the last word to the result
		if (currentWord.length() > 0) {
			if (reversedString.length() > 0) {
				reversedString.insert(0, ' ');
			}
			reversedString.insert(0, currentWord);
		}

		return reversedString.toString();
	}
}
