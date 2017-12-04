'''
Created on 30/11/2017

@author: Laura Santacruz
Exercise six of the workshop four
'''

def main():

    array1 = (input("Ingrese los numeros del arreglo separados por comas (,) \n"))
    print(array1) #Print entered array

    array2 = array1.split(",") #The array two is a chain where saved in the char without commas
    print(array2)#Print of entered array as chain

    array = array1.split(",") #The last array is for passe of chain to array

    for i in range(0, len(array2)):

        array[i] = int(array2[i])

    print(array)#Print of entered array without commas

    x = (input("Enter number to search in the array\n"))

    Lo = 0  # LowerBound
    Upper = len(array) - 1  # UpperBound
    mid = 0  # Middlepoint
    index = -1
    x = int(x)#Passed of str to int
    while Lo < Upper:
        mid = round((Lo + Upper) / 2)
        if x == array[int(mid)]:
            index =int(mid)
        else:
            if x < array[int(mid)]:
                Upper =int(mid) - 1
            else:
                Lo =int(mid) + 1
    if Lo == Upper and array[Lo] == x:
        index = Lo
        print ("The number it is ubicate in the index: ",index) #Print the position of the number entered

main()


