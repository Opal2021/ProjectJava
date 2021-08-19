package homeWork1;

public class TaskShopPrime_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Club policy
//		//*******************************
//		int myAgeRetricted = 18 ;
//		String sexRestricted = "Male" ;
//		//*******************************
//
//		//Customer input ID
//		int mikeAge = 23 ;
//		String mikeSex = "LGBT";
//		//********************************
//
//		if (mikeAge >= myAgeRetricted && mikeSex.equalsIgnoreCase(sexRestricted)) {
//		System.out.println("You can enter");
//		}else
//		System.out.println("You're out!!");
//
//		if (mikeAge >= 18 && mikeSex.equalsIgnoreCase("Male" )) {
//		System.out.println("You can enter");
//		}else
//		System.out.println("You're out!!");
//
//
//
//
//		String word1 = "Por";
//		String word2 = "por";
//		System.out.println(word1.equalsIgnoreCase(word2));
//
//		
//		
//		Task If-else or Ternary operator o for July 9 2021
//		1. Create a program to check positive and negative numbers and also zero.
//		(Take input from a user and let program decides).
	
		
		
		
		
		int numInput = 0;
		
		if (numInput < 0) {
		
		System.out.println("This number is negative");
		}
		
		if (numInput > 0 ) {
			
			System.out.println(" This number is positive");
			
		}
		if (numInput == 0) {
		
		
			System.out.println("This number is zero");
		
		}
		
//		2. Create a program to check a balance in a bank account. 
//		If the balance is more the $500, there will be no monthly fees. 
//		However, if the balance is less than $500, there will be $12 deducted from the current balance.
//		
		
		double balance   = -1;
		double   fees    = 12;
		
		if(balance > 500) {
		
			System.out.println("No monthly fees.");
		}
		
		if (balance < 500) {
		
		System.out.println("Current balance is " + (balance - fees));
		
		
		}
		
		
//		3. Create a program to check valid password. 
//		(Take input as a String from a user, then match it) 
//		if passed says "Successfully logged in" else says "Password is invalid!"
//			
		
		
		String password        = "pk12345678";
		
		String validPassword   = "Pk12345678";
		
		
		if( password.equals(validPassword)){
			
			System.out.println("Successfully logged in");
		
		}else
			
			System.out.println("Password is invalid");
		
		
		

//		4. Create a Java program for Amazon Prime : check if a prime member then no shipping fees print balance. 
//		If not a prime member but shopping over $50 then fee shipping and print balance. 
//		If no prime member and shopping less than $50, then add $8 to the balance and print total balance.
//		
		String user       = "fuck";
		
		System.out.println("Are you a prime member?" + user);
		
		
		String member     = "Yes";
		double amountShop =  10;
		
		double shippingFee=  8;
		
	
		
		if (user.equals(member)) {
			
		System.out.println(" No shipping fees and total is " + amountShop );
		
		}
			
			
		
				else if(user.equalsIgnoreCase("No") && amountShop >= 50 ) {
						
					System.out.println("Free shipping and total is " + amountShop);	
					
					}
					
				else if(user.equalsIgnoreCase("No") && amountShop <= 50) {
						
						
				   System.out.println( " Your Total is " + (amountShop+shippingFee) );		
					
			
			
		}else 
			System.out.println("Invalid");
			
		//if(user )
			
//			if (mikeAge >= 18 && mikeSex.equalsIgnoreCase("Male" )) {
//				System.out.println("You can enter");
//				}else
//				System.out.println("You're out!!");
		//
		
		
		
		
		int userNum = 77;
//		if (userNum !=0 ) {
//			
//				if(userNum % 3 == 0 && userNum % 5 == 0) {
//					
//					System.out.println("USDA");	
//				}
//					
//				else if(userNum % 5 == 0) {
//					
//					System.out.println("DA");
//				}
//				
//				else if(userNum % 3 == 0) {
//				
//					System.out.println("US");
//					
//				}
//		
//		}else
//			System.out.println("Number is invalid");
//		
		//Park method
		
		String printThis = "";
		
		if (userNum % 3 == 0) {
			printThis = "US";
		}
		if (userNum % 5 == 0) {
			printThis = printThis.concat("DA");
		}
		
		if (printThis.equals("")) {
			System.out.println("The number is not divisible");
		}else
			System.out.println(printThis);
		
		
		
		
		
		
		// Ternary Operator
		
		 int age = 20;
		 
		 String check = (age > 21)? "You can drink" : " You out";
		 
		// System.out.println("After checking your ID : " + check);
		 
		
		int check1 = (age > 21)? 100: 200;
		
		//System.out.println("You recive :" + check1);
		
		
		
		}//end method

}//end class
