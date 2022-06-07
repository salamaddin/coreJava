
public class OverloadinMain {
	public static void main(int args) {
		System.out.println(" method 1 Executing");
	}

	public static void main(char args) {
		System.out.println(" method 2 Executing");
	}

	public static final void main(String[] args, String[] s) {
		System.out.println(args[0] + " " + args[1]);
		System.out.println(s[0] + " " + s[1]);
	}

	public static void main(String[] args) {
		System.out.println("Original main ");
//		OverloadinMain.main(20);
//		OverloadinMain.main('s');
//		
//		String arr[] = { "hello", "friends" };
//		String arr2[] = { "hi", "folks" };
//		OverloadinMain.main(arr, arr2);
	}

}
