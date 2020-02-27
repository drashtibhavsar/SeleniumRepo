package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("black");
		colors.add("blue");
		colors.add("white");
		colors.add("darkbrown");
		
		
		System.out.println(colors);
		System.out.println(colors.size());
		/*System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		System.out.println(colors.get(3));
		System.out.println(colors.get(4));*/
		
		/*for(int i=0; i <colors.size(); i++)
		{
			System.out.println(colors.get(i));
		}*/
		
		for(String s : colors) {
			System.out.println(s);
			if(s.equals("white")) {
			break;
			} 
		}
		
	}

}
