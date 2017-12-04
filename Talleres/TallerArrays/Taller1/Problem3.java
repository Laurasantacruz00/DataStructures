package Taller1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem3 {
	
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
		
		bw.write("Array without commas\n"); //Print array
		bw.flush();
		PrintArray(array);
		
		
		bw.write("\nNumber that does not repeat: "+SolutionProblem(array)); //Print number that does not repeat
		bw.flush();
		
	}
    public static int SolutionProblem(int[] array) throws IOException
	{
		int counter = 0;
		
		for (int i=0 ; i < array.length;i++) //Traveling the array for the number repeat one 
		{
			counter=0;
			for (int j = 0; j < array.length;j++)//Traveling the array for the number repeat two 
			{
				if(array[i] == array[j])
				{
					counter++; //Counter of the number that repeat in the array
					counter = j;
				}
			}
			if(counter == 1 || counter < 2) //If the number repeat more than once
			{
				
				return counter;//Return counter with the number 
			}
		}

		return counter;
		
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
