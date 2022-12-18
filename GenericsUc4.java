package practiseProblemsDay13;

public class GenericsUc4 {

	public static <E extends Comparable<E>> E getMax(E[] array) {
		E max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(max) > 0) {
				max = array[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 80, 29, 55, 66, 98 };
		Float[] floatArray = { 2.2f, 5.7f, 1.9f, 6.4f, 3.2f };
		String[] stringArray = { "Mayur", "Saikumar", "Vinod", "Shubham" };

		System.out.println(getMax(intArray));
		System.out.println(getMax(floatArray));
		System.out.println(getMax(stringArray));
	}

}
