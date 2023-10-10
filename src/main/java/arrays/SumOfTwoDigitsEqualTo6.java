package arrays;

public class SumOfTwoDigitsEqualTo6 {
	public static void main(String[] args) {
		int[] inputArray = { 1, 3, 2, 4, 2, 3, 3};
		findPairsWithSum6(inputArray);
	}

	public static void findPairsWithSum6(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 6) {
					System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}

}
