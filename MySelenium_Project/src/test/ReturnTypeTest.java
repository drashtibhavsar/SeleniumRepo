package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(2, 3);
		int i = sum1(5,6);
	//System.out.println(i);
		
		String j = test();
		System.out.println(j);
	}

	public static void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static int sum1(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public static String test() {
		String s = "Hello";
		return s;
	}
}
