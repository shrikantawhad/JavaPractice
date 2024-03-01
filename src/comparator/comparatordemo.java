package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatordemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(54, 76, 33, 89, 32);
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// return o1 % 10 > o2 % 10?1:-1;

				if (o1 % 10 > o2 % 10)
					return 1;
				else
					return -1;
			}
		};

		Collections.sort(list, com);
		System.out.println(list);

	}

}
