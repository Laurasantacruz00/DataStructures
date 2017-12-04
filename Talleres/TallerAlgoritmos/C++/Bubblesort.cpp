#include <iostream>
#include <string.h>
#include <vector>
#include <cstdlib>
#include <sstream>

using namespace std; 

/*
* @author Laura Santacruz
* Exercise one of the workshop four
*/

void BubbleSort(int array[], int m)
{
//BubbleSort
	//The numbers of less value go up in the array
	for(int i = 0 ; i < m-1 ; i++)
	{
		bool sw=false;
		
		for(int j = 0 ; j < m-1 ; j++)
		{
			if(array[j] > array[j+1])//If the previous number is greater at the next number, the change is made
			{
				int Intcambio = array[j]; //Exchange
				array[j] = array[j+1]; //Next
				array[j+1] = Intcambio;//Exchange
				sw=true;
			}
		}
		if (sw=false)
		{
			break;//The program is over
		}
	}
}

int main(){
	int m;
	cout<<"Ingrese Tamaño del array\n";
	cin>>m;//size of array
	string string;
    vector<int> v; //Vector where is saved the numbers entered
	int matriz[m][m];//Array where is saved the numbers in the vector(v)
	
	cout<<"Ingrese los Numeros del array separados por (,)\n";
    cin >> string;//The numbers are saved as string 
    stringstream st(string);
    
	int indice;
	
	while (st >> indice){
        v.push_back(indice);//Value that is moving
        if (st.peek() == ',') //if find a comma, ignore and past to the next. 
            st.ignore(); 
    }
	 
	for (int i=0; i< v.size(); i++){
    	array[i] = v.at(i); //it is passed the values of the vector to the array
	}
	
	cout<<"\nArreglo inicial\n";
	for (int i = 0; i < m; i++)
    {
        cout<<"["<<array[i]<<"]";//Print original array
    }
	BubbleSort(array,m);
	cout<<"\nArreglo ordenado\n";
	for (int i = 0; i < m; i++)
    {
        cout<<"["<<array[i]<<"]";//print array ordered.
    }
	
	return 0;
	
}

