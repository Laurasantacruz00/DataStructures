package TallerMatrices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author Laura Santacruz
 * 
 * Taller matrices 
 * Punto cinco
 * 
 **/

public class Rombo2 {

	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
    public static void main(String[] args) throws IOException 
    {
        bw.write("Ingrese el tamaño de la matriz\n");//se solicita el tamaño de la matriz
        bw.flush();
        int m = Integer.parseInt(br.readLine());//se pasa el tamaño de String a integer
        
        bw.write("Ingrese los elememtos de la matriz separados por coma(,)\n");
        bw.flush();
        String ArrayConComa = br.readLine(); //Se almacena en la cadena los numeros con las comas
        
        String[] CadenaSinComas = ArrayConComa.split(",");//Se crea una nueva cadena que contiene los numeros sin las comas
		//Para esto se usa el split
        
      //Se crean dos matrices: 
      //Una sera para los numeros ingreseados y la otra para los numeros fuera del rombo
        String[][] matriz=new String[m][m];
        String[][] matriz2=new String[m][m];
        
        PrintArray(matriz2);
        MatrizSinComas( matriz, CadenaSinComas);
        
        //Mostrando Matriz Original
        bw.write("\nMatriz inicial: ");
        bw.flush();
        PrintMatriz(matriz);
       
        bw.write("\n");
        
        OutRombo(matriz,matriz2,m);
        bw.write("\nElementos externos al rombo interno de la matriz: ");
        bw.flush();
        
        PrintMatriz(matriz2);
    }
    public static void OutRombo (String [][] matriz,String[][]matriz2,int m) throws IOException
    {
    	int valorinicial = ((m-1)/2), valorFinal = valorinicial + 1;
        
        boolean Change = true;
        
        for(int i = 0 ; i < m; i++)
        {
        	// Captura los valores excluidos del rombo
            for (int j = 0; j < m; j++)
            {
            	if ( i > 0 && i < m-1) //Cuando i sea mayor a cero y menor a m-1 se pasara a la siguiente condicion 
				{
					if ( j < valorinicial || valorFinal < j ) //Cuando j sea menor que valor inicial y mayor a valor final se guardara en matriz2
					{
						matriz2[i][j] = matriz[i][j]; 
					}
				}
				else
				{
					//Si esta no se cumple
					matriz2[i][j] = matriz[i][j]; 
				}
            }
            if ( i > 0 && i < m-1)
			{
				if (Change = true ) //Con el cambio se sabe cuando cambiar el valorinicial y final
				{
					//Si esta en 1 hace la primera parte del rombo donde valor inicial disminuye en 1 y el final amuenta 1 
					if ( (valorinicial-1) > 0 && (valorFinal) < m-1)
					{
						valorinicial--;
						valorFinal++;
					}
					else
					{
						Change = false;
						valorinicial = 1;
						valorFinal = m-2;
					}
				}
				else
				{
					//Si cambio esta en 0 pasa a hacer la segunda parte: valorinicial aumenta en 1 y el final disminuye en 0
					valorinicial++;
					valorFinal--;
				}
			}
			
        }
    }
    public static void MatrizSinComas(String[][] matriz,String []CadenaSinComas) throws IOException
    {
        int a = 0; //Se procede a pasar los elemtos de la cadena a un arreglo entero, pasando de String a int
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                    matriz[i][j] = CadenaSinComas[a];    
                    // se asignan los valores del array a la matriz por orden de entrada
                    a++;//Aumentando Subindice
            }
        } 
    }
    public static void PrintMatriz(String matriz[][]) throws IOException
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            bw.write("\n");
            bw.flush();
            for (int j = 0; j < matriz[j].length; j++) 
            {
                bw.write("[" + matriz[i][j] + "]");// Imprimir matriz
                bw.flush();
            }
        }
    }
    public static void PrintArray(String array[][]) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[j].length; j++) 
            {
                array[i][j] = " ";
            }
        }
    }

}

