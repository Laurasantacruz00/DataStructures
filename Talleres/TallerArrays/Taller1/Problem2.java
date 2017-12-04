package Taller1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Laura Santacruz
 * Problem two of the first workshop
 *
 */

public class Problem2 {
	
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException 
	{
    	Problem2 Print = new Problem2();
    	
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
		
		bw.write("Array without commas\n"); //Print array
		bw.flush();
		PrintArray(array);
		
		int multi[]=new int[array.length];
		multi = Print.SolutionProblem(array);
		
		bw.write("\nNew array\n");
		bw.flush();
		Problem2.PrintArray(multi);
		
		PrintArray(array);
	}
    public static int[] SolutionProblem(int[] array) throws IOException
	{
    	int multi[]=new int[array.length];
		multi[0]=1;
		
		for (int i = 0 ; i < multi.length;i++)
		{
			multi[i]=1;
		}
		for (int i = 0 ; i < array.length;i++)
		{
			for (int j = 0 ; j < array.length;j++)
			{
				if(i==j)
				{
					multi[i] = multi[i] * 1;//Product of the array
				}
				else 
				{
					multi[i] = multi[i]*array[j]; //Product of the array
				}
			}
		}

    	return multi; //Product of all elements of the array. 
		
	}
    public static void PrintArray(int[] array) throws IOException
    {
        for (int i = 0; i < array.length; i++) 
        {
            bw.write("[" + array[i] + "]\t");//Array Orderer 
            bw.flush();
        }
    }
    

}
