package todo;

import java.util.stream.IntStream;

public class TestRamda {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(System.out::println);
	}
}
