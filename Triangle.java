import java.util.Scanner;
public class Triangle {


public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("input side 1")
	int a = in.nextInt();
	
	System.out.print("input side 2")
	int b = in.nextInt();
	
	
	System.out.print("input side 3")
	int c = in.nextInt();
	
	answer(a, b, c)
	
	 in.close();
 }
	
	
	
	public static void answer(int a, int b, int c) {
	if (a <= 0 || b <= 0, || <= 0){ 
		return "error" }
	
	else if (a + b < c || a + c < b || a + c < a) {
		return "Unable to triangle "; }
	
	else {
	return "triangleable"; }
	
}
	
}
