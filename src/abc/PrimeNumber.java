package abc;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 97;

		int num = number/2;
		System.out.println(num);
		boolean flag = false;
		for (int i = 2; i < number / 2; i++) {
			//num += i;
			if (number % i == 0) {
				// System.out.println(number + " is Prime Number");
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Prime Not Number");
		}
	}

}
