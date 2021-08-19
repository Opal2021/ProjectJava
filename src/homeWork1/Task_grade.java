package homeWork1;

public class Task_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		2. A school has following rules for grading system:
//			a. Below 25 - F
//			b. 25 to 45 - E
//			c. 45 to 50 - D
//			d. 50 to 60 - C
//			e. 60 to 80 - B
//			f. Above 80 - A
//			Ask user to enter marks and print the corresponding grade.
//		
		
		int marks = 45;
		
		if (marks < 25) {
			
			System.out.println("Grade F");
		}
			
		if (marks >= 25 && marks <=45 ){
			System.out.println("Grade E");
		}
			
			
		if (marks >= 46 && marks <= 50 ){
			System.out.println("Grade D");
		}	
			
			
		if (marks >= 51 && marks <= 60 ){
			System.out.println("Grade C");
		}
			
			
		if (marks >= 61 && marks <= 80 ){
			System.out.println("Grade B");
		}		
			
       if (marks > 80) {
			
			System.out.println("Grade A");
		}
		
		
		
		

	}//end method

}//end class
