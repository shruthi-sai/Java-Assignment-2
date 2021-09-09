import java.util.Scanner;
public class SQUARE_AND_SQUARE_ROOT {
	
	public static int Main() {
		double num,result,squareRoot;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextDouble();
         
        double square = num*num;
        squareRoot=num/2;
        do {
			result = squareRoot;
			squareRoot=(result+(num/result))/2;
		}
		while((result-squareRoot)!=0);
        
        System.out.println("Square of "+ num + " is: "+ square);
        System.out.println("Squre Root is:"+squareRoot);
		return 0;
	}
			
		
		
	
		
		
	

	public static void main(String[] args) {
		Main();
		
		

	}

}
