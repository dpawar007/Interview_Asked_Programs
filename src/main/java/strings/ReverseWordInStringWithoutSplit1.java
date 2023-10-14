package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseWordInStringWithoutSplit1 {

	static List<String> set = new ArrayList<>();

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("sai software solutions");
		while (st.hasMoreTokens()) {
			set.add(st.nextToken());
		}
		for (int i = set.size() - 1; 0 <= i; i--) {
			System.out.print(set.get(i)+" ");
		}
	}
}
