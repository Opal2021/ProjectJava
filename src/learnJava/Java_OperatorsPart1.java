package learnJava;

public class Java_OperatorsPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("first way");

	    // double x = 5.0 / 2.0;
	
	    // System.out.println("the result is " + x);
	    
	    System.out.println("second way");
	    
	    int a =5;
	    
	    // double x = (double)5 / 2.0;
	    System.out.println("work only one opperance if two");
	   
	    /*
	     * + addition
	     * - minus
	     *   division
	     * * multiplication
	     * % modulus
	     */
	    
	    int x = 5 % 2;
	    System.out.println(x);
	    System.out.println("the result is 1 so it can be useful things to use modulus");
	    
	    //precedence - order evaluated
	    //(5+3) / 2 ) * 3
	
		System.out.println("evaluated from left to right");
		
		int x1 = 5;
		x++;
		System.out.println(x);
		
		//System.out.println("increase the value of x by 1");
		 
		int x2 = 5;
		int a2 = x++;
		System.out.println(x = 6);
		System.out.println(a = 5);
		
		//System.out.println("decrease the value of x ")
		
		int x3 = 5;
		int a3 = ++x;
		System.out.println(x = 6);
		System.out.println(a = 6);
		
		
		System.out.println("add prefix the opposite happened here");
		
		int y = 5;
		y += 1;
		y = y + 1;
		System.out.println("y +=1 same as y = y + 1");
		
		//Java incerment and decrement
		//postfix : First operation and then increment
		//Prefix  : First Increment and then perform Operation
		
		//HW
		
		int agePor = 20 ;
		int agePark =  ++ agePor ; 

		
		//int newAge = age ;
		
		//int newAge = age ++ ; 
		
		System.out.println(agePark); // 20
		
		//System.out.println(numOne);
		
		
	}

}
