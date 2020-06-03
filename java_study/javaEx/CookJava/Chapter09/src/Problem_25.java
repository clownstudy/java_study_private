public class Problem_25 {

	static short getNumber() {
		return (short) (Math.random() * 45 + 1);
	}

	public static void main(String[] args) {
		short[] lotto = { 0, 0, 0, 0, 0, 0 };
		short i, k, num;
		char dupl = 'N';
	
		System.out.printf("** 로또 추첨을 시작합니다. ** \n\n");

		for (i = 0; i < 6;) {
			num = getNumber();

			for (k = 0; k < 6; k++)
				if (lotto[k] == num)
					dupl = 'Y';

			if (dupl == 'N')
				lotto[i++] = num;
			else
				dupl = 'N';
		}

		System.out.printf("추첨된 로또 번호 ==>  ");
		for (i = 0; i < 6; i++) {
			System.out.printf("%d   ", lotto[i]);
		}
	}
}
