public class Problem_39 {
	public static void main(String[] args) {

		Integer s[] = { 2, 3, 5, 7, 9 };
		Integer maxVal, minVal;
		int i, k;
		int count = 0;
		boolean changeYN = false;

		System.out.print("정렬 전 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");

		for (i = 0; i < 4; i++) {
			count++;
			for (k = 0; k < 4 - i; k++) {
				if (s[k] > s[k + 1]) {
					changeYN = true;
					maxVal = Math.max(s[k], s[k + 1]);
					minVal = Math.min(s[k], s[k + 1]);
					s[k] = minVal;
					s[k + 1] = maxVal;
				}
			}
			if (changeYN)
				changeYN = false;
			else
				break;
		}

		System.out.print("\n총 회전수 : " + count);
		System.out.print("\n정렬 후 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(s[i] + "  ");
	}

}
