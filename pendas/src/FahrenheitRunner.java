//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class FahrenheitRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the fahrenheit value :: " );
		double f = kb.nextDouble();
		
		//print your answer here
		
		System.out.print("celcius =" + ( 5*(f-32.0))/9.0);
		
	}
}

/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees Celsius
11.28 degrees Celsius
28.03 degrees Celsius
23.89 degrees Celsius
37.78 degrees Celsius


*/
