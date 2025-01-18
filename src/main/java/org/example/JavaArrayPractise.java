package org.example;

public class JavaArrayPractise {
    public static void main(String[] args) {
        // Sort the array without using in-built method -
        int[] arr = {89,45,63,33,5,76};
        for(int i=0; i<arr.length-1 ; i++){
            for(int j=0; j< arr.length-1 -i; j++){
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem ;
                }
            }
        }
        for(int no:arr){
            System.out.print(no+" ");
        }


    }
}
