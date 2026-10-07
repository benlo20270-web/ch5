
import java.util.Scanner;
public class Quadratic {




    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a: ");
    int a = in.nextInt();	
    
    System.out.print("Enter b: ");
    int b = in.nextInt();	
    
    System.out.print("Enter c: ");
    int c = in.nextInt();	
    
    String result = answer(a, b, c);
    System.out.println(result);
        
        in.close();
}
    
    
    
    
    
    
    
    public static String answer(int a, int b, int c) {
     
     if ((b * b - 4 * a * c) < 0) {
		 return "Error");
	
	}else if ((2 * a) == 0) {
		return "Error";
		
	
	} else {
	double x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
     double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	return "x1 = " + x + ", x2 = " + x2;
	}

}
   
 }

      
     
     
