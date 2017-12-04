package Calculator;

public class Operaciones {
	
	public void operaciones(){}
	
	/**
	 * Addition = Number1 + Number2
	 * @param Number1
	 * @param Number2
	 * 
	 * @return number1+number2
	 * 
	 */
	
	public int addition(int number1, int number2) 
	{
		
		return number1+number2;
				
	}
	/**
	 * Subtraction = Number1 - Number2
	 * @param Number1
	 * @param Number2
	 * 
	 * @return number1-number2
	 * 
	 */
	public int subtraction(int number1, int number2) 
	{
		
		return number1-number2;
	}
	
	/**
	 * Multiplication = Number1 * Number2
	 * @param Number1
	 * @param Number2
	 * 
	 * @return number1 * number2
	 * 
	 */
	
	public int multiplication(int number1, int number2) 
	{
		
		return number1 * number2;
	}
	/**
	 * Division = Number1 / Number2
	 * @param Number1
	 * @param Number2
	 * @return res
	 */
	public double division(int number1, int number2) 
	{ 
		if(number2!=0)
		{
			int res =number1/number2;
            return res;
        }
		else{
                  return Double.NaN;     
                }              
	}
	/**
	 * Residue = Number1 % Number2
	 * @param Number1
	 * @param Number2
	 * 
	 * @return number * factorial(number - 1)
	 * 
	 */
	public double residue(int number1, int number2) 
	{
		return number1 % number2;
	}
		
	public int factorial(int number) 
	{
		if(number < 1)
			return 1;
		else
			return number * factorial(number - 1);
	}
	
	/**
	 * Exponentiation
	 * @param Base
	 * @param Exponent
	 * 
	 * @return 
	 * 
	 */
	
	public int exponentiation(int base, int exponent) 
	{
		if(exponent == 1)
		{	
			return base;
		}
		else{
			if(exponent == 0)
				return 1;
			else{
				
				if(exponent > 1){
					
					return multiplication(base, exponentiation(base,exponent-1));
				}
				else{
					
					return (1/exponentiation(base, multiplication(exponent,(-1))));
				}	
			}	
		}
	}
	
	/**
	 * Sine
	 * @param number1
	 * 
	 * @return Math.sin(number1)
	 * 
	 */
	public double sin(int number1)
	{
		return Math.sin(number1);
    }
		
	/**
	 * Sine
	 * @param number1
	 * 
	 * @return Math.cos(number1)
	 * 
	 */
	
	public double cos(int number1)
	{
		return Math.cos(number1);
	}
	
	/**
	 * Integral
	 * @param initial_point
	 * @param final_point
	 * @param step_increment
	 *
	 * @return response
	 * 
	 */
	
	public double integral (int Initial_Point,int Final_Point, int Step_Increment) 
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
