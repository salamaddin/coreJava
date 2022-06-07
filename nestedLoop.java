
public class nestedLoop {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		for(i=1; i<=3; i++) {
			for(j=1; j<=3; j++) {
				if(i==2 || j==2) {
					break;
				}
			}
		}
		System.out.println(i+ " " +j);
	}

}


// i j print
// 1 1
// 1 2		terminate the inner loop
// 2 1      again terminate
// 3 1
// 3 2      terminate the loop
// 4   4 2
