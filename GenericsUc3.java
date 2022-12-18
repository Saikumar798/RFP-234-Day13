package practiseProblemsDay13;

import java.util.Scanner;

public class GenericsUc3 {
	public static <E extends Comparable<E>> void max(E String1, E String2, E String3) {
		E maxString = String1;
		if (String2.compareTo(maxString) > 0) {
			maxString = String2;
		}
		if (String3.compareTo(maxString) > 0) {
			maxString = String3;
		}
		System.out.println("maximun Number is :" + maxString);
	}

	public void maximum() {
		String String1, String2, String3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String1 = sc.next();
		System.out.println("Enter String2");
		String2 = sc.next();
		System.out.println("Enter String3");
		String3 = sc.next();
		max(String1, String2, String3);
	}

	public static void main(String[] args) {
		GenericsUc3 generic = new GenericsUc3();
		generic.maximum();


}
}
