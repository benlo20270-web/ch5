public class Fermat {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a: ");
        int a = in.nextInt();
    
    System.out.print("Enter b: ");
        int b = in.nextInt();
        
        
    System.out.print("Enter c: ");
        int c = in.nextInt();
        
        
    System.out.print("Enter n: ");
        int n = in.nextInt();
        
        check(a,b,c,n);
        
        in.close();
        
	}
        
        
        
        public static void check(int a, int b, int c, int n) {
			if ( (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) && n >= 2) {
				
				System.out.print("Holy smokes, Fermat was wrong!");
			} else {
			System.out.print("No, that doesn’t work.");
				
			
			
         
		}
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
