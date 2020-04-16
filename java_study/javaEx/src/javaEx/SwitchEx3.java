package javaEx;

public class SwitchEx3 {
	public static void main(String[] args) {
		//System.out.println(args[0].charAt(0));
		char c = args[0].charAt(0);
		switch(c) {
		case 'A':
			System.out.println("AAAA");
			break;
		case 'B':
			System.out.println("ABAA");
			break;
		case 'C':
			System.out.println("AACA");
			break;
		case 'D':
			System.out.println("AAAD");
			break;
		default:
			System.out.println("----");
		}
		}
	}


