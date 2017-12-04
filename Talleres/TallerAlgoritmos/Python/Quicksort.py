'''
Created on 30/11/2017

@author: Laura Santacruz

Algoritmo de ordenamiento Quicksort
'''
            
def main():

    array1 = (input("Ingrese los numeros del arreglo separados por comas (,) \n"))
    print(array1)
    array2 = array1.split(",")
    #print(array2)
    array = array1.split(",")
    for i in range(0, len(array2)):
        array[i] = int(array2[i])
    #print(array)


    i = array[0]
    j = len(array)-1

    #print(Quicksort(array,i,j))
    print ("Array Ordenado")

    primero = i
    ultimo = j
    central = round((primero + ultimo) / 2)
    pivot = array[int(central)]
    while i <= j:
        while array[i] < pivot:
            i = + 1
            while array[j] > pivot:
                j = - 1
                if i <= j:
                    temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                    i = + 1
                    j = - 1
    if primero < j:
        print(array, primero, j)
    if i < ultimo:
        ptint(array, i, ultimo)

main()

"""less, iqual, higher = [], [], []

    for i in range(len(Array)):  # create the iterations for with conditionals for separate the major and minor numbers
        if (Array[i] < Array[pivote]):
            less.append(Array[i])
        elif (Array[i] > Array[pivote]):
            higher.append(Array[i])
        else:
            iqual.append(Array[i])
    print ()

    if len(less) > 1:  # define which half will take
        less = Quick_sort(less)
    if len(higher) > 1:
        higher = Quick_sort(higher)
    return less + iqual + higher"""


