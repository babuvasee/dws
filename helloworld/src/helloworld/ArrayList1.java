package helloworld;
import java.util.*;

public class ArrayList1 {
	
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
		
		Collections.sort(aList);

		ListIterator<MyItems> listMy = aList.listIterator(3);
		
		
		
		int i = 0;
		while(listMy.hasPrevious()) {
			items[i] = listMy.previous();
            
			System.out.println(items[i].name);
			System.out.println(items[i].icon);
			System.out.println(items[i].distance);
			i++;
		}
		
		Collections.reverse(aList);
		
		i = 0;
		while(listMy.hasNext()) {
			items[i] = listMy.next();
            
			System.out.println(items[i].name);
			System.out.println(items[i].icon);
			System.out.println(items[i].distance);
			i++;
		}
		
		/**
		 * 
		 */
		   ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
           list.add("Ravi");//Adding object in arraylist  
           list.add("Vijay");  
           list.add("Ravi");  
           list.add("Ajay");  
            
           System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
              ListIterator<String> list1=list.listIterator(list.size());  
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }  
        System.out.println("Traversing list through for loop:");  
           for( i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
        System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  
                
            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr=list.iterator();  
              itr.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });
              
              
              
             
              
	}



}

