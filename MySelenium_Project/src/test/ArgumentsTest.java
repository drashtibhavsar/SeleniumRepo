package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();
		sum(6,7);
		sum(8,9);
	}
	
	public static void sum() {
		int i=5+6;
		System.out.println(i);
	}
	
	public static void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

}
