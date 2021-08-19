package homeWork1;

public class Task_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. Take input of age of 3 people by user 
//		and determine oldest and youngest among them.
//		
		int ppl1  = 5;
		int ppl2  = 6;
		int ppl3  = 7;
		
		if (ppl1 < ppl2) {
			System.out.println("Age "+ ppl1 +" is youngest");
		}
		
		if (ppl1 < ppl3) {
			System.out.println("Age "+ ppl1 +" is youngest");
		}
		
		if (ppl2 > ppl1) {
			System.out.println("Age "+ ppl2 +" is oldest");
		}
		
		if (ppl2 > ppl3) {
			System.out.println("Age"+ ppl2 +" is oldest");
		}
		
		
	}// end method

}//end class
