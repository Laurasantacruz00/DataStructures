package Taller1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Laura Santacruz
 *
 * Problem one of the first workshop
 *
 */


public class Problem1 {
	
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
    
    	public static void main(String[] args) throws IOException 
    	{
    		bw.write("Ingrese los elememtos del array separados por coma(,)\n");
    		bw.flush();
    		String ArrayConComas=br.readLine(); //Is stored in the chain the numbers with(,)
		
    		String [] CadenaSinComas = ArrayConComas.split(","); //In this chain there numbers without(,)
    		//Using the string for separate the (,) of number and looking only numbers 
		
    		int []array = new int [CadenaSinComas.length];  
		
    		//it is create a array with the same size of the char
		
		
    		//The elements are passed of the char at the array, of string at integer.
    		int a = 0; //Sub-index
        
    		for (int i = 0; i < CadenaSinComas.length; i++) 
    		{
    			array[a] = Integer.parseInt(CadenaSinComas[i]); //The elements are passed of string at integer.
    			a++;//increases the sub-index
    		}
		
    		bw.write("Enter the value of the constant\n");
    		bw.flush();
    		int k = Integer.parseInt(br.readLine()); //The constant
    		
    		bw.write("\nThe number of parejas is "+Problem1.SolutionProblem(array,k)); 
    		bw.flush();//Print Solution
  
		 
    	}
    public static int SolutionProblem(int[] array, int k) throws IOException
	{
		int counter = 0;
		
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array.length;j++)
			{
				if(array[i]-array[j] == k)
				{
					counter+=1; //account the couples equals to the constant
				}
			}
		}
		
		return counter;
		
	}
   
}
