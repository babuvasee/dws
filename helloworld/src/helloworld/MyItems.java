package helloworld;

public class MyItems implements Comparable<MyItems> {
	
	 String name;
     String icon;
     Integer distance;
    
		public MyItems(String name1, String icon1, int distance1) {
			name = name1;
			icon = icon1;
			distance = new Integer(distance1);
		}
	    // constructor, methods skipped for brevity
		
		public Integer  getId() {
			return distance;
		}
		
		public void  setId(int distance1) {
			this.distance = new Integer(distance1);
			
		}
		 
		 
		public int compareTo(MyItems myItems) {
		        return this.getId().compareTo(myItems.getId());
		  }

}
