package FibonacciAndRiemann;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 *@author Laura Santacruz
 * 
 * Fibonacci series algorithm                                           
 */

public class Fibonacci {
	public static void main (String[]args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
		
		bw.write( "Enter the number of fibonacci\n" );
		int x = Integer.parseInt( br.readLine() ); //This is a number with which the succession it will be done 
		bw.flush();
		
		while (x > 1)//While the number enter be greater than one, when the number be one this stops.
		{
			bw.write( "La solucion del fibonacci es "+ (Fibonacci(x))  +  "\n" ); //Print the solution 
			x = Integer.parseInt( br.readLine());
		
		}bw.flush() ;
		
	}
	/**
	 * Fibonacci 
	 * 0, if x = 0 
	 * 1, if x = 1. 
	 * fibonacci (x - 1) + fibonacci (x - 2), x > 1.
	 * 
	 * @param x
	 * @return (x-1)+(x-2)
	 * 
	 */
	
	private static Object Fibonacci(int x) {//This is a funcion where is does the operation
		
		return (x-1)+(x-2); //return answer of operation
	
	}
}
