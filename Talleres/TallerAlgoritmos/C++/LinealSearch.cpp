#include <iostream>
#include <string.h>
#include <vector>
#include <cstdlib>
#include <sstream>

using namespace std; 

/*
* @author Laura Santacruz
* Exercise five of the workshop four
*/

int index;
int LinealSearch(int array[], int m, int num)
{
	index = -1;
	int value = num;
	for(int i = 0 ; i < m ; i++)
	{//Traveling the array 
		if(array[i] == value)
		{//it is traveling the array  el arreglo until the number is found
			index = i;
			break;
		}
	}
	return index;//position of the number entered
};

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
	
    int num;
    cout<<"Ingrese numero que desea buscar en el arreglo\n";
    cin>>num;
    
	LinealSearch(array, m, num);
	
	cout<<"\nEl numero esta en la posicion "<<index<<" del arreglo"; //Print the position of the number entered
	
	return 0;
	
}

