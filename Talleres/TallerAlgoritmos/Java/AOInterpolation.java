package TallerAlgoritmosByO;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Laura Santacruz
 *
 * Exercise seven of the workshop three
 *
 */

public class AOInterpolation {
	
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException{
    	bw.write("Ingrese los elememtos de la matriz separados por coma(,)\n");
        bw.flush();
        String ArrayConComa = br.readLine(); //Is stored in the chain the numbers with(,)
		
        String[] CadenaSinComas = ArrayConComa.split(",");//In this chain there numbers without(,)
		//Using the string for separate the (,) of number and looking only numbers 
        int [] array;
		array = new int [CadenaSinComas.length];//Se va a crear un array con el mismo tamaño de la cadena que tiene solo los numeros 
		//it is create a array with the same size of the char
		
		
		//The elements are passed of the char at the array, of string at integer.
		int a = 0; //Sub-index
    
		for (int i = 0; i < CadenaSinComas.length; i++) 
		{
			array[a] = Integer.parseInt(CadenaSinComas[i]); //The elements are passed of string at integer.
			a++;//increases the sub-index
		}
		int x = 0;
		bw.write("Ingrese numero que desea buscar\n");
		 x = Integer.parseInt(br.readLine()); //so that x is integer
		bw.flush();
		
		bw.write("\n El elemento esta en la pocision "+InterpolationSearch(array, x)+" del array");
		//Position in where the number is 
		bw.flush();
	}
	public static int InterpolationSearch(int[] array,int x){
		
		int n = array.length; //Size of the array
		int Lo = 0, Hi = n-1, index = -1, upper = n-1;
		//lowerBound, higherBound, upperBound.
		int middlepoint = 0;
		
		while (Lo < upper){//While the lower bound it is less that upper bound
			
			//If upper bound is less than lower bound, there is not a solution
			middlepoint = Lo + ((Hi - Lo)/(array[Hi]-array[Lo]))*(x - array[Lo]);
			
			if(x == array[middlepoint]){
				//x has been found
				index = middlepoint;
				break;
			
			}else{
				
				if(x < array[middlepoint]){
				
					upper = middlepoint-1;
				
				}else{
					
					Lo=middlepoint+1;
				
				}
			}
		}
		if (Lo == upper && array[Lo] == x){
			index = Lo;
		}
		return index;
	}
	
	public static void PrintArray(int array[]) throws IOException{
		
        for (int i = 0; i < array.length; i++){
            
        	bw.write("["+array[i]+"]"); //print array
            bw.flush();
        
        }
    }
    
}
