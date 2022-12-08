package arrays_배열항복검색;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		int index = Arrays.binarySearch(scores, 99);
		// 오름차순으로만 할 경우 사용
		System.out.println("index ;" + index);

	}

}
