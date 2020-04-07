package helloworld;

public class ArrayDemo {
	
	public static void main(String ar[]) {
		
		//iArr[0], [1] [2] [3] [4]
		int iArr [] = {10, 30, 91, 12, 3};
		int iTemp = 0;
		
		System.out.println(iArr.length);
		
		for(int i=0; i<(iArr.length ); i++) {
			for(int j=i+1; j<(iArr.length ); j++) {
			System.out.println(i + " = " + iArr[i] + " j " + j + "=" + iArr[j] );
			
				if(iArr[i] > iArr[j]) {
					System.out.println( "before " + iArr[i] + " " + iArr[j]);
					iTemp = iArr[j] ;
					iArr[j] = iArr[i];
					iArr[i] = iTemp;
					System.out.println( "Swapped " + iArr[i] + " " + iArr[j]);
				}
			}
			
		}
		
		for(int i=0; i<(iArr.length  ); i++) {
			System.out.println(i + " = " + iArr[i]);
		}
		
	}

}
