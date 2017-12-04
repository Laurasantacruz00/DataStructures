package TallerMatrices;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;


/**
 * 
 * @author Laura Santacruz
 *
 */

public class Espiral {
	
	

	public static void main(String[] args)  throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
		
		Random rd = new Random();
		
		bw.write("Ingrese valor M \n");
		bw.flush();
		
		int m = Integer.parseInt(br.readLine());
		
		
		int[][] matriz = new int[m][m];
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < m; j++)
			{
				matriz[i][j] = rd.nextInt(100) ; // Matriz llenada con numeros enteros aleatoreos
			}
		}
		for (int a = 0; a < matriz.length; a++){
			System.out.println();
			for (int b = 0; b < matriz.length; b++){
				
				bw.write("|"+ matriz[a][b] + "|\t"); //Se imprime la matriz original.
				bw.flush();
			}
			
		}
		
		int inicial = 0; //Punto inicial, donde parte el espiral. 
		int Vfinal = m-1; //Valor final, este es el espacio que recorre cada parte 	
		//ejem: si inicial esta en 1 entonces el espiral empieza de 1 hasta el valor final que es m-1
		
		int c = 0; 	
		int sw= 0;
		

		System.out.println("\n"+"________________Espiral___________________");
		
		while(sw == 0 ){
			
			for(int x = inicial; x <= Vfinal; x++){ 
				//Esta la primera parte del espiral, va de izquierda a derecha 
				// va a empezar por toda la fila X que en este caso iria desde 0 hasta 5 (m -1)
				System.out.println();
				bw.write( "["+matriz[inicial][x]+"]"); //Se impremen los numero que recorrio.
				bw.flush();
				
				c++; //Con cada numero del espiral se le aumenta una, asi cuando llegue a m*m este se detendra.  
				
			}
			
			for(int y = inicial+1; y <= Vfinal; y++){
				//Va desde la ultima posicion pasada hasta abajo 
				//En esta segunda parte del esperial ya no se recorre una fila si no una columna
				//Esta va desde 1 en inicial hasta 5 (m-1)
				
				System.out.println();
				bw.write("["+matriz[y][Vfinal]+"]"); //Se impremen los numero que recorrio.
				bw.flush();
			
				c++;
				
			}
			
			
			for(int x = (Vfinal-1); x >= inicial; x--){
			
				//Tercer parte: en esta volvemos a las filas pero con la diferencia de que esta ira en decremento ya que 
				// siguiendo con el ejemplo este habra quedado en 5,5 y necesita llegar a 5,0 por tanto tiene que ir en decremento para llegar al valor inicial que seria 0
				System.out.println();
				bw.write("["+matriz[Vfinal][x]+"]");//Se impremen los numero que recorrio.
				bw.flush();
				
				
				c++;
				
			}
			
			for(int y = (Vfinal-1); y >= (inicial + 1); y--){
				
				//En esta cuarta y ultima parte se empieza desde las columnas en 4 y tiene que subir hasta 1 por tanto 
				//Tiene que ir en decremento
				
				System.out.println();
				bw.write("["+matriz[y][inicial]+"]");//Se impremen los numero que recorrio.
				bw.flush();
			
				c++;
			}
		
			inicial = inicial + 1;
			Vfinal = Vfinal-1;
			
			if(c == m*m)
				sw = 1;
			
		}
		
		
	}
	
	

}
