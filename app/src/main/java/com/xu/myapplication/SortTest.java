package com.xu.myapplication;

/**
 * @author:xlc
 * @date:2019/9/16
 * @descirbe:
 */
public class SortTest {


    //插入排序
    public void insertSort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && temp < arr[j-1]){

                arr[j] = arr[j-1];
                j--;
            }
            if (j!=i){
                arr[j] = temp;
            }
        }
    }


    public void insterSort2(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && temp <arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            if (j!=i) {
                arr[j] = temp;
            }

        }
    }
    public void insterSort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int j =i;
            while (j>0 && temp <arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            if (j!=i){
                arr[j] = temp;
            }
        }
    }


    //冒泡排序
    public void sort1(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < length-1-i; j++) {
                if (arr[j] >arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public void maopaoSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] >arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }


    //选择排序
    public void sort2(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] <arr[min]){
                    min = j;
                }
            }

            if (i!=min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }
    }


    //选择排序
    public void sort3(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] <arr[min]){
                    min = j;
                }
            }
            if (1!=min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}
