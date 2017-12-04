#include <iostream>
#include <string.h>
#include <vector>
#include <cstdlib>
#include <sstream>

using namespace std;

/*
* @author Laura Santacruz
* Exercise four of the workshop three
**/

int main(){
	
	int m;
	cout<<"Ingrese Tamaño de la matriz\n";
	cin>>m;//size of matrix
	string string;
    vector<int> v; //Vector where is saved the numbers entered
	int matriz[m][m];//Array where is saved the numbers in the vector(v)
	
	cout<<"Ingrese los Numeros de la matriz separados por (,)\n";
    cin >> string; //The numbers are saved as string 
    stringstream st(string);
    
	int indice;
	
	while (st >> indice){
        v.push_back(indice);//Value that is moving
        if (st.peek() == ',') //if find a comma, ignore and past to the next. 
            st.ignore(); 
    }
	 
	for (int i=0; i< v.size(); i++){
    	for (int i=0; i< v.size(); i++){
    		matriz[i][j] = v.at(i)(j); //it is passed the values of the vector to the matrix
		}
	}
	
	cout<< "Matriz original \n";
	
	for(int i = 0; i < m ; i++)
	{
		for(int j = 0;j < m; j++)
		{
			
			cout<<"["<<matriz[i][j]<<"]"; //Print original matrix
		} 
		cout<<"\n";
	} 
	
	cout<< "Matriz transpuesta  \n";
	for(int i = 0;i < m; i++){
		for(int j = 0;j < m; j++)
		{	
			cout<<"["<<matriz[j][i]<<"]"; //Print matrix transpuesta.
		} 
		cout<<"\n";
	}
	
	
	getch();
	return 0;
} 
