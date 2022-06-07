package arrays;

public class ArrayTest {

	public static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void avg(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum "+sum);
		System.out.println("avegare "+sum / arr.length);
	}

	public static void evenOdd(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is even number");
			} else {
				System.out.println(arr[i] + " is  odd number");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 20, 10, 24, 53, 2, 8, 6, 5, 254, 4 };
		max(arr);
		avg(arr);
		evenOdd(arr);

	}

}
