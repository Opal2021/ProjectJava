package homeWork1;

public class Task_convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Java Task for today July 6 2021
//		1. Convert US dollar $ to
//		1.1 British Pound Sterling
//		1.2 Euro
//		1.3 CAD dollar
//		1.4 Japanese Yen

		
		double British = 0.72;
		
		double Euro    = 0.85;
		
		double Canada  = 1.26;
		
		double Japan   = 110.27;
		
		double Us      = 1;
		
		double result1 = Us * British;
		
		double result2 = Us * Euro;
		
		double result3 = Us * Canada;
		
		double result4 = Us * Japan;
		
		System.out.println("Convert " + Us + "to british :" + result1);
		
		System.out.println("Convert " + Us + "to euro :" +result2);
		
		System.out.println("Convert " + Us + "to canada :" +result3);
		
		System.out.println("Convert " + Us + "to japan :" +result4);
		
		
//		2. Convert Kg to
//		2.1 lbs.
//		2.2 Ounce
//		2.3 Ton
		
        double Kg      = 35;
		
		double Lbs     = 2.204620;
		
		double Ounce   = 35.274;
		
		double Ton     = 0.00110231;
		
        double result5 = Kg * Lbs;
		
		double result6 = Kg * Ounce;
		
		double result7 = Kg * Ton;
		
		
//        System.out.println("Convert " + Kg + " to lbs : " + result5);
//		
//		System.out.println("Convert " + Kg + " to Ounce : " + result6);
//		
//		System.out.println("Convert " + Kg + " to Ton : " + result7);
		
//		3. Create a program to convert Meter to
//		3.1 inch
//		3.2 foot
//		3.3 mile
//		3.4 yard
//		3.5 Kilometer

		
        double Meter     = 1;
		
		double Inch      = 39.3701;
		
		double Foot      = 3.28084;
		
		double Mile      = 0.000621371;
		
		double Yard      = 1.09361;
		
		double Kilometer = 0.001;

		
		double resultA = Meter * Inch;
		
		double resultB = Meter * Foot;
		
		double resultC = Meter * Mile;
		
		double resultD = Meter * Yard;
		
		double resultE = Meter * Kilometer;
		
		
		
		System.out.println("Convert " + Meter + " meter(s) is equal to " + Inch +" inch(es)");
		

		System.out.println("Convert " + Meter + " meter(s) is equal to " + Foot +" feet");
		
		
		System.out.println("Convert " + Meter + " meter(s) is equal to " + Mile +" mile(s)");
		
		
		System.out.println("Convert " + Meter + " meter(s) is equal to " + Yard +" yard(s)");
		
		
		System.out.println("Convert " + Meter + " meter(s) is equal to " + Kilometer +" kilometer(s)");
		
		
		
		
		
		//4. Find area of rectangle : length = 5.87 , width= 9.87 ?
		
		
		double length = 5.87;
		
		double width  = 9.87;
		
		double area   = length * width;
		
		System.out.println("Area of rectangle is " + area);
		
		
		
		
		
		
		
		
		
		
		
	}//end method

}//end class
