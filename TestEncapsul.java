class Encapsul{
	private int num =10;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
public class TestEncapsul {

	public static void main(String[] args) {
		Encapsul obj = new Encapsul();
		System.out.println(obj.getNum());
		
		obj.setNum(20);
		System.out.println(obj.getNum());
	}

}
