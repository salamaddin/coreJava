
public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		
		while (i < 5) {
			
			if (i == 2) {
//				i++;
				continue;
			}
					
			System.out.println(i);
			i++;
		}
		
		
		//for loop
//		for (int i = 0; i < 10; i++) {
//			  if (i == 4) {
//			    continue;
//			  }
//			  System.out.println(i);
//			}

	}

}
