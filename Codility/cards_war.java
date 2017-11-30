import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String A, String B) {
        // write your code in Java SE 8
        int wins = 0;

		if (A != null && B != null && A.length() == B.length()) {
			Map<String, Integer> deck = new HashMap<>();
			for (int i = 2; i <= 9; i++) {
				deck.put(String.valueOf(i), i);
			}
			deck.put("T", 10);
			deck.put("J", 11);
			deck.put("Q", 12);
			deck.put("K", 13);
			deck.put("A", 14);

			for (int i = 0; i < A.length(); i++) {
				Integer a = deck.get(String.valueOf(A.charAt(i)));
				Integer b = deck.get(String.valueOf(B.charAt(i)));
				if ((a != null && b != null)
						&& a.intValue() > b.intValue()) {
					wins++;
				}
			}
		}
		return wins;
    }
}