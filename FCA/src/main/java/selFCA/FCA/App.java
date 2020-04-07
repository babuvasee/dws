package selFCA.FCA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str = "Ruthrapathy";
        System.out.println("0, 5" + str.substring(0, 5));
        System.out.println("0, 1" +str.substring(0, 1));
        System.out.println("0, 0" +str.substring(0, 0));
        double negDouble = -4.8;
        System.out.println((int)negDouble);
        
        try {
        System.out.println("5, 1" +str.substring(5, 1));
        } catch (Exception e) {
        	System.out.println("error handled");
        }
        try {
            
        System.out.println("0, 20" +str.substring(0, 20));
        } catch (StringIndexOutOfBoundsException e) {
        	System.out.println("error handled");
        }
          
    }
}
