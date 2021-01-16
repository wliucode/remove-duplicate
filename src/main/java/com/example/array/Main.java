package com.example.array;

/*
    Remove Duplicate(s) from Sorted Array

    Given a sorted array nums, remove the duplicates in-place
        such that each element appear only once and return the new length.

    Do not allocate extra space for another array,
        you must do this by modifying the input array in-place with O(1) extra memory.

    Time Complexity : O(n)
    Auxiliary Space : O(1)  //The extra space/memory used by the algorithm
 */

public class Main {

    // The method to remove duplicate element(s) in the sorted array
    // it will return new size of the modified array
    public int removeDuplicate(int[] arr){

        int n = arr.length;

        // corner case; 0 or 1;
        if (n == 0 || n == 1) {
            return n;
        }

        // The index to keep tracking the next element
        int j = 0;

        // Traversing each element of the sorted array
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }

        // store the last element
        arr[j++] = arr[n-1];

        return j;
    }

    public static void main(String[] args) {

        Main m = new Main();

        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int n = m.removeDuplicate(arr);

        System.out.println("The length after removing the duplicated element in sorted array: " + n);

        // Print the modified array which is passed by reference in method ("removeDuplicate(arr)")
        for (int i=0; i<n; i++){
            System.out.println(arr[i] + "" );
        }
    }
}
