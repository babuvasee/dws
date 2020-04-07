package helloworld;
import java.util.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		//System.out.print("A");
		

		MyItems[] items = new MyItems[10];
		
		
		
		String strName1 = "A1";
		String strName2 = "A2";
		String strName3 = "A3";
		
		items[0] = new MyItems(strName1, "One", 1);
		items[1] = new MyItems(strName2, "Two", 2);
		items[2] = new MyItems(strName3, "Three", 3);
		 
		ArrayList<MyItems> aList = new ArrayList<MyItems>();
		
		aList.add(items[0]);
		aList.add(items[1]);
		aList.add(items[2]);
		
		ListIterator<MyItems> list1 = aList.listIterator(3);
		
		int i = 0;
		while(list1.hasPrevious()) {
			items[i] = list1.previous();
            
			System.out.println(items[i].name);
			System.out.println(items[i].icon);
			System.out.println(items[i].distance);
			i++;
		}
		
	
		
		
	}



}

