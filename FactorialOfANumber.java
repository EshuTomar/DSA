package DSA;
// Import scanner class for taking the input 
import java.util.Scanner; 

public class FactorialOfANumber {
    public static void main(String[] args) {
        
   
    // ClassName object = new ClassName();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); 
        if(n < 0)
		{
		    System.out.println("Error");
		}
		else 
		{
		    // n! = n * n-1 * n-2 * n-3 ---- 1 
		    // n! = 1 * 2 * 3 * 4 * 5 .... n 
		    
		    // 0! = 1
		    
		    int factorial = 1; 
		    for(int i=2; i<=n; i=i+1)
		    {
		        factorial = factorial * i;
		    }
		    
		    System.out.println(factorial);
		}
    }

}
