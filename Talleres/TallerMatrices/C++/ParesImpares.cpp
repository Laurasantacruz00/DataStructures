#include<iostream>
#include<conio.h>
#include<cstdlib>


using namespace std;

/**
 * @Author Laura Santacruz.
 * Exercise three of the workshop three
*/

int main(){
	
	int m;
	cout<<"Ingrese tamaño de matriz \n"; 
	cin>>m;//Size of the matrix
	
	int num, Par = 0, Impar = 0, Negativo = 0, Positivo = 0; 
	
	//This is the arrays Aqui se pondran los arrays de cada contador para asi poder mostrar los numeros
	int matriz[m][m]; //Matrix for the random numbers
	int pares [m]; //Array for the numbers odd
	int impares [m];//Array for the numbers even
	int positivos [m];//Array for the numbers positive
	int negativos [m];//Array for the numbers negative
	
	for(int i = 0;i < m; i++){
		for(int j = 0;j < m; j++)
		{
			matriz[i][j] = rand() % 100; //it is fill the matrix with the random numbers
			
			num = matriz[i][j] % 2; 
			
			if(num == 0)//If the number have a module two equals zero is odd 
			{
				Par = Par + 1; //One is added to the counter and the number is saved in the array
				pares[j] = matriz[i][j] ;
					
			}else{
				//Ifnot the number is even
				Impar = Impar + 1;//One is added to the counter and the number is saved in the array
				impares[j] = matriz[i][j] ;
			}
			if(matriz[i][j] < 0) //if the number is less at zero, the number is negative, ifnot the number is positive.
			{
				Negativo = Negativo + 1; //One is added to the counter and the number is saved in the array
				negativos[j] = matriz[i][j] ;
					
			}else{
				Positivo = Positivo + 1; //One is added to the counter and the number is saved in the array
				positivos[j] = matriz[i][j] ;
			}
		} 
	} 
	
	//This is for print the arrays ant the couhters
	
	cout<<"\n Matriz";
	for (int a = 0; a <  m; a++){
		for (int k = 0; k < m; k++){
			cout<<"["<<matriz[a][k]<<"] \t"; //Print matrix
			
		}
			
	}
	
	cout<<(" ");
	
	cout<<("\n En la matriz hay  ",Par," numeros pares: ");
	
	cout<<"\n Numeros pares";
		for (int i = 0; i <  m; i++){
			cout<<" ["<<pares[i]<<"] \t";  //Print array of the odds numbers
		}
	cout<<(" ");
	
	
	cout<<("\n En la matriz hay " ,Impar, " numeros impares: ");
	
	cout<<("\nNumeros impares");
		for (int i = 0; i <  m; i++){
			cout<<"["<<impares[i]<<"] \t"; //Print array of the even numbers
		}
	cout<<(" ");
		
	cout<<("\n En la matriz hay ",Negativo, " numeros negativos: ");
	
	cout<<("\n Numeros negativos");
		
		for (int i = 0; i <  m; i++){
			cout<<"["<<negativos[i]<<"] \t"; //Print array of the negative numbers
		}
	cout<<(" ");
		
	cout<<"\n En la matriz hay "<<Positivo<<" numeros positivos: ";
	
	cout<<"\n Numeros positivos";
		for (int i = 0; i <  m; i++){
			cout<<"["<<positivos[i]<<"] \t"; //Print array of the positive numbers
		}
	cout<<" ";
	
	getch();
	return 0;
	
}
