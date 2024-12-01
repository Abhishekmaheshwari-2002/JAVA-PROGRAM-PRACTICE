package com.example.java_exam;
/*
Write a Java Program for Linear Search and Binary Search in simple language with taking user input
 */

class Linear_Binary_Search {
    //    implementation for linear search
    public int linear_s(int[] arr, int size, int element) {
//     take three argument arr,size,element
        for (int i = 0; i < size; i++) {
//      checked element was found or not
            if (arr[i] == element) {
                return i;//return index number of founded element
            }
        }
        return 0;
    }

    //    implementation for binear search
    public int binary_s(int[] arr, int size, int element) {
//  low,mid,high are three points in binary search
        int low, mid, high;
        low = 0;//low is an initial index number of sorted an array
        high = size - 1;//high is a last index number of sorted an array
        while (low <= high) {
            mid = (low + high) / 2;//mid is the middle index number according to low,high indexes
//          checked element was found
            if (arr[mid] == element) {
                return mid;//element found it return index number of the element
            }
//          checked element is less than arr[mid] or not
            if (arr[mid] < element) {
                low = mid + 1;//update the low with mid
            } else {
                high = mid - 1;//update the high with mid
            }
        }
        return 0;
    }
}

public class binary_linear {

    public static void main(String[] args) {
        Linear_Binary_Search ls = new Linear_Binary_Search();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};//array created with the size of 6
//        int element = 3;
        System.out.println("The element " + 3 + " was found index number :" + ls.linear_s(arr, 4, 3));
        System.out.println("The element " + 4 + " was found index number :" + ls.binary_s(arr, 4, 4));

    }
}

