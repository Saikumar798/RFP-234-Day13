package practiseProblemsDay13;

import java.util.Scanner;

public class GenericsUc1 {
	public static <E extends Comparable<E>> void max(E num1, E num2, E num3) {
		E maxNum = num1;
		if (num2.compareTo(maxNum) > 0) {
			maxNum = num2;
		}
		if (num3.compareTo(maxNum) > 0) {
			maxNum = num3;
		}
		System.out.println("maximun Number is :" + maxNum);
	}

	public void Integer() {
		Integer num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1");
		num1 = sc.nextInt();
		System.out.println("Enter Num2");
		num2 = sc.nextInt();
		System.out.println("Enter Num3");
		num3 = sc.nextInt();
		max(num1, num2, num3);
	}

	public static void main(String[] args) {
		GenericsUc1 generic = new GenericsUc1();
		generic.Integer();

	}

}
