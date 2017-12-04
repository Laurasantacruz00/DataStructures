#include <iostream>
#include <string.h>
#include <vector>
#include <cstdlib>
#include <sstream>

using namespace std; 

/*
* @author Laura Santacruz
* Exercise two of the workshop four
*/

void InsertionSort(int array[], int m) 
{
	for (int i = 1; i < m; i++)
	{
       int k = array[i]; //NumberSelect: with that are see the higher and the lees
	   //Numbers to the left are the ordered and at the right are the disordered 
       int j = i-1;
       while (j >= 0 and array[j] > k) 
       {
           array[j+1] = array[j]; //The change is made.
           j = j-1;
       }
       array[j+1] = k;//arregloEnPocision[NumOrd+1] = NumSelect
   }
	
}
int main(){
	int m;
	cout<<"Ingrese Tama�o del array\n";
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
	
	InsertionSort(array,m);
	cout<<"\nArreglo ordenado\n";
	for (int i = 0; i < m; i++)
    {
        cout<<"["<<array[i]<<"]";//Print array ordered.
    }
	
	return 0;
	
}

