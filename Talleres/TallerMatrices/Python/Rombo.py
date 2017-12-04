from random import randint
import math

'''
Created on 30/11/2017

@author: Laura Santacruz
Exercise one of the workshop three
'''

m = int(input("Ingrese M\n")) #Entered size of the matrix
matriz=[]
matriz2=[]

valorinicial = math.ceil((m-1)/2) ; #Starting value
valorfinal = valorinicial + 1;#Final value

i = 0
j = 0
g = valorinicial

change = False

for k  in range(m): 
	#Create the matriz
	matriz.append([0]*m)  #In this it is saved all random numbers En esta se guardan todos los numeros aletoreos
	matriz2.append([0]*m) #In this only saved the numbers that form the rhombus

for i  in range(m):
	for j in range(m):
		matriz[i][j]=randint(0,100) #fill the matrix with random numbers llena la matriz con numeros aleatorios
	for g in range (valorfinal): #This saved the values of the rhombus in other matrix

		matriz2[i][g] = matriz[i][g]

	if change == False:#The boolean is for stops the program
		#With the change it is knows when change the starting value and the final value
		if ((valorinicial-1) >= 0) ^ (valorfinal < m): 
			#If it is in 1 it makes the first part of the diamond, where the starting value decreases by 1 and the final value counts 1
			valorinicial = valorinicial -1
			valorfinal = valorfinal+1
		
		else:
			change = True
			valorinicial = 0
			valorfinal = m-1
	else:
		#If the change is in 0 it makes the second part of the diamond, where the starting value increase by 1 and the final value decreases in 0
		valorinicial = valorinicial +1
		valorfinal = valorfinal-1	

#Print the matrix
a = 0
b = 0
print(" Matriz")
for  a in range(m): 
	for b in range(m):
		print ("[",matriz[a][b],"]") #Print Matrix.
print (matriz,"\n")		

#Print numbers of the diamond
print("Matriz Rombo")
for  a in range(m): 
	print (matriz2[a],"\n") #Print matrix of the diamond
