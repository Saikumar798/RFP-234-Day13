package practiseProblemsDay13;

import java.util.Scanner;

public class GenericsUc2 {
	public static <E extends Comparable<E>> void maximum(E float1, E float2, E float3) {
		E maxNum = float1;
		if (float2.compareTo(maxNum) > 0) {
			maxNum = float2;
		}
		if (float3.compareTo(maxNum) > 0) {
			maxNum = float3;
		}
		System.out.println("maximun Number is :" + maxNum);
	}

	public void max() {
		Float float1, float2, float3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1");
		float1 = sc.nextFloat();
		System.out.println("Enter Num2");
		float2 = sc.nextFloat();
		System.out.println("Enter Num3");
		float3 = sc.nextFloat();
		maximum(float1, float2, float3);
	}

	public static void main(String[] args) {
		GenericsUc2 generic = new GenericsUc2();
		generic.max();

}
}
