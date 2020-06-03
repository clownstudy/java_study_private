public class Ex14_06 {
	public static void main(String[] args) {

		Integer data[] = { 9, 3, 7, 2, 5 };
		Integer maxVal, minVal;
		int i, k;

		System.out.print("정렬 전 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + "  ");

		for (i = 0; i < 4; i++)
			for (k = i; k < 5; k++) {
				maxVal = Math.max(data[i], data[k]);
				minVal = Math.min(data[i], data[k]);
				data[i] = minVal;
				data[k] = maxVal;
			}

		System.out.print("\n정렬 후 ==> ");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + "  ");
	}
}
