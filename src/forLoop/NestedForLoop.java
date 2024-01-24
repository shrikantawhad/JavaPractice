package forLoop;

public class NestedForLoop {

	public static void main(String[] args) {

		int[] arr = { 9, 1, 8, 2, 7, 5, 3, 4, 6 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// System.out.println("i: "+arr[i] +" "+"j: "+arr[j]);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		// System.out.println("\n");

		for (int i : arr) {
			System.out.print(i);
		}
	}
}
