package Calculator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * @author Laura Santacruz
 * Calculator 
 * 
 */

public class Calculadora {
     
	static BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
     static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
  
	
	 public static void main(String[] args) throws IOException{
		 
		 int option; //Number entered by the person  
		
		 do
		 {	 
			 option = option();
			 int[] parameters=getParameters(option);
			 operation(option, parameters);
		 }
		 while (option != 11); //Only have eleven options so if the number entered by the person is greater of eleven print 'error'
		
	 }
	
	
	 public static int option() throws IOException
	 {
		 bw.write("\n\nSelect one of the following options: \n1. addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Module \n6. Factorial \n7. Exponent \n8. Seno \n9. Coseno \n10. Integral \n11. Exit \n");
		 bw.flush();
		 int option = Integer.parseInt(br.readLine()); //Option entered by the person 
		 
		 return option;//Return the choice 
	 }
	
	
	 public static int[] getParameters(int option) throws IOException
	 {
		 int[] parameters = null; //Numbers of parameters for the operations
		
		 //Depending on the option it's know the operation
		 
		 switch (option)
		 {
				case 1: //addition.
				{	
					parameters = new int [2];
					bw.write("Will be performed a sum \n");
					
					bw.write("Enter the first number:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the second number:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 2: //Subtraction.
				{
					parameters = new int [2];
					bw.write("Will be performed a Subtraction\n");
					
					bw.write("Enter the first number:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the second number:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
			
				}break;
		
				case 3: //	Multiplication.
				{
					parameters = new int [2];
					bw.write("Will be performed a Multiplication\n");
					
					bw.write("Enter the first number:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the second number:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 4: //Division.
				{
					parameters = new int [2];
					bw.write("Will be performed a Division\n");
					
					bw.write("Enter the first number:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the second number:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 5: //Module.
				{
					parameters = new int [2];
					bw.write("Will be performed a module\n");
					bw.flush();					
					
					bw.write("Enter the first number:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the second number:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 6: //Factorial.
				{
					parameters = new int [1];
					bw.write("Will be performed a factorial\n");
					bw.flush();
					
					bw.write("Enter the value to calculate:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 7: //Exponential.
				{
					parameters = new int [2];
					bw.write("Will be performed a exponential\n");
					
					bw.write("ingrese el valor de la base:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("ingrese el valor del exponente:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 8: //Sine.
				{
					parameters = new int [1];
					bw.write("Will be performed a sine \n");
					bw.flush();
					
					bw.write("Enter the value to calculate:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
				
				}break;
		
				case 9: //Cosine.
				{
					parameters = new int [1];
					bw.write("Will be performed a cosine \n");
					bw.flush();
					
					bw.write("Enter the value to calculate:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
			
				}break;
		
				case 10: //Integral.
				{
					parameters = new int [3];
					bw.write("Will be performed a integral of x^2\n");
					bw.flush();
				
					bw.write("Enter the lower limit:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the higher limit:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
					
					bw.write("Enter the increment: \n");
					bw.flush();
					parameters[2]=Integer.parseInt(br.readLine());
				
				}break;
		
				default:
				{
					System.exit(0); //Exit the program 
				}
		 }
	   
		return parameters;
	 }
	
	 public static void operation(int option, int[]parameters) throws IOException
	 {
		 Operaciones operation =new Operaciones();
		 
		 //Print the result 
		 
		 switch (option)
		 {
		//Depending on the option print the result
				case 1:
				{	//Result addition
					int result = operation.addition(parameters[0],parameters[1]);
					bw.write("the result of addition: "+result+"\n");
					bw.flush();
				
				}break;
		
				case 2:
				{	//Result subtraction 
					int result = operation.subtraction(parameters[0],parameters[1]);
					bw.write("the result of subtraction: "+result+"\n");
					bw.flush();
				
				}break;
		
				case 3:
				{	//Result multiplication
					int result = operation.multiplication(parameters[0],parameters[1]);
					bw.write("the result of multiplication: "+result+"\n");
					bw.flush();
				
				}break;
		
				case 4:
				{
					//Result division
					double result =operation.division(parameters[0],parameters[1]);
					DecimalFormat df = new DecimalFormat("#0.000");
				
					if(result == Double.NaN)
					{
						bw.write("the division of 0 it's not possible.\n"); //Print message of ERROR.
						bw.flush();
				
					}else
					{
						bw.write("the result of division: "+ df.format(result) +"\n");
						bw.flush(); //Result.
					}
				
				}break;
		
				case 5:
				{
					//Result residues
					double result =operation.residue(parameters[0],parameters[1]);
					bw.write("the result of residue: "+result+"\n");
					bw.flush();
				}break;
		
				case 6:
				{
					//Result factorial
					double result =operation.factorial(parameters[0]);
					bw.write("the result of factorial: "+result+"\n");
					bw.flush();
		
				}break;
			
				case 7:
				{
					//Result exponential
					double result =operation.exponentiation(parameters[0],parameters[1]);
					bw.write("the result of exponential: "+result+"\n");
					bw.flush();
		
				}break;
		
				case 8:
				{
					//Result sine
					double result=operation.sin(parameters[0]);
					bw.write("the result of sine: "+result+"\n");
					bw.flush();
		
				}break;
		
				case 9:
				{
					//Result cosine
					double result=operation.cos(parameters[0]);
					bw.write("the result of cosine"+result+"\n");
					bw.flush();
		
				}break;

				case 10:
				{
					//Result integral
					double result=operation.integral(parameters[0],parameters[1],parameters[2]);
					bw.write("the result of integral"+result+"\n");
					bw.flush();
		
				}break;
		
				default:
				{
		 
					System.exit(0);
		
				}
	}
	}
}
