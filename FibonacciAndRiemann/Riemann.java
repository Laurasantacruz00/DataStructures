package FibonacciAndRiemann;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Laura Santacruz
 * Sum of riemann
 */

public class Riemann {

	public static void main(String[] args) throws NumberFormatException, IOException  
	{
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
		
		bw.write( "Sum of Riemann "+ Suma_Riemann(0, 10, 1) + "\n"); //Print sum
		bw.write( "Sum of Riemann "+ Suma_Riemann(0, 10, 2) + "\n");//Print sum
		bw.flush() ;


	}

	private static double Suma_Riemann (int Initial_Point, int Final_Point, int Step_Increment ) 
	{
		//Method for approximate the total under the curve of the graph
		double Response = 0.0;//Response of the sum 
		double Temp;//Response of the sum 
		
		double x_i, x_i_1, y_i;
		
		x_i_1 = Initial_Point; //Sum of riemann to the left
		x_i = Step_Increment + x_i_1 ; //Sum of riemann to the right
		
		for (int i = (int) x_i; i <= Final_Point; i += Step_Increment  ) 
		{ 
			//This cycle starts in the integer of x_i and ends in the final point
			
			y_i = (x_i * x_i_1);//y_i is the multiply of the Sum of riemann to the left and right  
			Temp = (y_i) * (x_i - x_i_1);
			Response += Temp;
			
			//Change
			x_i_1 = x_i;
			x_i = Step_Increment + x_i_1;
		}
		
		return Response; //Return sum
	}

}
