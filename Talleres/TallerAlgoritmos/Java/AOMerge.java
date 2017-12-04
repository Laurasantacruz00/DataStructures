package TallerAlgoritmosByO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AOMerge {

	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException 
    {
    	AOMerge Order = new AOMerge(); //Array organized
    	
    	
    	bw.write("Ingrese los elememtos del array separados por coma(,)\n");
		bw.flush();
		String ArrayConComas=br.readLine(); //Is stored in the chain the numbers with(,)
		
		String [] CadenaSinComas = ArrayConComas.split(","); //In this chain there numbers without(,)
		//Using the string for separate the (,) of number and looking only numbers 
		
		int []array = new int [CadenaSinComas.length];  
		
		//Se crea un array de tipo entero con el mismo tamaño de la cadena que no tiene comas
		
		
		//Se procede a pasar los elemtos de la cadena a un arreglo entero, pasando de String a int
		int a = 0; //Subindice
        
		for (int i = 0; i < CadenaSinComas.length; i++) 
        {
            array[a]=Integer.parseInt(CadenaSinComas[i]); //Se pasa de String a Integer
            a++;//Se va aumentando el subindice
        }
		
		
		//Este es el arreglo ingresado por el usuario sin comas.
        bw.write("\nArreglo original:"); 
        AOMerge.ArrayOriginal(array);//Se muestra el arreglo original, sin comas.
        bw.flush();
  
		 
        //Se crea un segundo Array en el cual se almacenara el arreglo ordenado 
        int [] array2 =  new int [array.length];
       
        bw.write("\n Arreglo ordenado: ");
		array2 = Order.MergeSort(array);
		AOMerge.ArrayOrdered(array2);//Se muestra el arreglo ordenado.
        bw.flush();
    }
	
	public int[] MergeSort(int[] array){
		
		int i,j,k;
		int ElementosIzq, ElementosDer; 
		
		//Si tiene mas de un indice no se ha ordenado.
		//Si su indice es uno, ya esta ordenado.  
		
		if(array.length == 1)
		{
			return array;
		}else{
			
			//Aqui se van a llenar dos arrays uno para la parte derecha del arreglo y otro para la parte izquierda.
			
			ElementosIzq = array.length/2;  //Tamaño de Sublista Izquierda.
			ElementosDer =  array.length - ElementosIzq; //Tamaño de Sublista Derecha.
			
			//Sublistas
			int ArrayIzq[] = new int [ElementosIzq] ;
			int ArrayDer[] = new int [ElementosDer];
			
			//Copiando los elementos de la primera parte a la sublista izquierda
			
			for(i = 0; i < ElementosIzq; i++){
				
				ArrayIzq[i] = array[i];
			}
			
			//Copiando los elementos de la segunda parte a la sublista izquierda
			
			for(i = ElementosIzq; i < ElementosIzq+ElementosDer; i++){
				
				ArrayDer[i-ElementosIzq] = array[i];
			}
			
			ArrayIzq = MergeSort(ArrayIzq);
			ArrayDer = MergeSort(ArrayDer);
			
			
			i = 0;j = 0;k = 0;
			
			while(ArrayIzq.length != j && ArrayDer.length != k){
				
				if (ArrayIzq[j] < ArrayDer[k]){
					
					array[i] = ArrayIzq[j];
					
					i++;
					j++;
					
				} else{
					
					array[i] = ArrayDer[k];
					i++;
					k++;
				}
			}
			
			//Array final
			
			while(ArrayIzq.length != j ){
				array[i] = ArrayIzq[j];
					
					i++;
					j++;
			
			}
			while(ArrayDer.length != k){
				array[i] = ArrayDer[k];
				
				i++;
				k++;
			}
			
			}
			return array;
		}
		
    public static void ArrayOrdered(int[] array2) throws IOException
    {
        for (int i = 0; i < array2.length; i++) 
        {
            bw.write("\n");
            bw.write("[" + array2[i] + "]\t");//Arreglo Ordenado 
            bw.flush();
        }
    }
    
    public static void ArrayOriginal(int[] array) throws IOException
    {
        for (int i = 0; i < array.length; i++) 
        {
            bw.write("\n");
            bw.write("[" + array[i] + "]\t"); //Arreglo Original 
            bw.flush();
        }
    }
	
}
