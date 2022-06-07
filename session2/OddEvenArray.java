package session2;

public class OddEvenArray {

	public static void main(String[] args) {
		int[] arr = {3, 6, 12, 1, 5, 8};
		OddEvenArray obj = new OddEvenArray();
		obj.reArrange(arr);
	}
	
	public  void reArrange(int arr[]) {
		int N = arr.length;
	
	     int[] odd = new int[N];
	     int[] even = new int[N];
	     int j=0;
    	 int k=0;
	     for(int i=0; i<N; i++) {
	    	
	    	 if(arr[i] % 2 == 0) {
	    		 even[j++] = arr[i];
	    	 }else {
	    		 odd[k++] = arr[i];
	    	 }
	     }
	     
	      j=0;
    	  k=0;
	     
	  
	     for (int i = 0; i < arr.length; i++) {
			if(i%2 ==0) {
				arr[i] = even[j++];
			}
			else {
				arr[i] = odd[k++];
			}
		}
	     
	     for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	

}
