
public class EvenArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Even numbers: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
