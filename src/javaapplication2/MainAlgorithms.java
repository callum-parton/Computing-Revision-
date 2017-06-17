/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;

public class MainAlgorithms {

    public static void main(String[] args) {
        int[] myArray = {1,4, 8, 3, 3, 2, 10, 18, 4,7};
        int[] myArray2 = {1,13,4,4,8,3,4, 8, 3, 3, 2, 10, 18, 4,7};
        System.out.println("Bubble sort:");
        bubbleSort(myArray);
        System.out.println("Insertion sort:");
        insertionSort(myArray2);
    }
    /*
        Bubble sort 'bubbles' items to the right. After the first pass,
        the largest item is at the end of the array. 
    
        Only useful for small data sets. Has a big O of o(n^2) due to nested 
        loops. Runs in 0(n) in worst case scenario. 
    */
    public static void bubbleSort(int[] toSort) {
        boolean sorted = false; //assume array is unsorted 
        int lastUnsorted = toSort.length - 1;
        while (!sorted) {
            sorted = true; //set to sorted until we know a swap has to be made
            for (int i = 0; i < lastUnsorted; i++) {
                if (toSort[i] > toSort[i + 1]) {
                    int temp = toSort[i];
                    toSort[i] = toSort[i + 1];
                    toSort[i + 1] = temp;
                    sorted = false; //a swap has been made so another pass is needed
                    
                }
            }
            lastUnsorted--; 
        }
        System.out.println(Arrays.toString(toSort));
    }
    /*
        Insertion sort works a bit like sorting a deck of cards. It takes one 
        value at a time and slots it into the correct place. The item is deemed
        sorted once it's greater than the values prior to it. 
    
        This starts from the second item (the first is already sorted) and then 
        compares the previous item to it. If the item is less, a swap is made 
    
        This is also only useful for small data sets. It has a big o of o(n^2) 
        as it also has two nested loops. However, if the list is almost sorted 
        it is slightly better than bubble sort. 
    */
    public static void insertionSort (int[] list) {
	for (int i = 1; i < list.length; i++) {
		int currentValue = list[i];
                int previousIndex = i - 1; //the previous index to the current one
                while (previousIndex >= 0 && list[previousIndex] > currentValue) {
                    list[previousIndex + 1] = list[previousIndex]; // shifts out of place items up
                    previousIndex--; 
                }
                list[previousIndex+1] = currentValue; //slots item into correct place 
        }
	System.out.println(Arrays.toString(list));
    }
}
