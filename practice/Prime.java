package practice;

public class Prime {

	public static void main(String[] args) {

		int lower = 1;
		int upper = 100;

		for (int i = lower; i <= upper; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	static boolean isPrime(int num) {

		if (num < 2)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

}
//		int num = 10;
//		boolean isPrime=true;
//
//if (num < 2) {
//isPrime = false;
//} else {
//for (int i = 2; i < num; i++) {
//	if (num % i == 0) {
//		isPrime = false;
//		break;
//	}
//}
//}

//String result = isPrime ? "Prime" : "Not Prime";
//System.out.print(result);
	
			
	
		
//	}
//}