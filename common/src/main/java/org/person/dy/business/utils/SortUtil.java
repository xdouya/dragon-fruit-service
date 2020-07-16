package org.person.dy.business.utils;

import java.util.Arrays;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/5/10 10:29
 */
public class SortUtil {

    public static void quickSort(int [] arr){
        quickSort(arr, 0 , arr.length - 1);
    }

    private static void quickSort(int [] arr, int left, int right){
        if (left < right){
            int temp = arr[left];
             int i = left;
             int j = right;
             while (i < j){
                 while (arr[j] >= temp && i < j){
                     j--;
                 }
                 if (i < j){
                     arr[i] = arr[j];
                     i++;
                 }
                 while (arr[i] < temp && i < j){
                     i++;
                 }
                 if (i < j){
                     arr[j] = arr[i];
                     j--;
                 }
             }
             arr[i] = temp;
             quickSort(arr, left, i);
             quickSort(arr, i + 1, right);
        }
    }

    public static void mergeSort(int [] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void  mergeSort(int [] arr, int left, int right){
        if (left < right){
            int mid = (right - left) / 2 + left;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left,mid, right);
        }
    }

    private static void merge(int [] arr, int left, int mid, int right){
        if (left < right){
            int[] temp = new int[right - left +1];
            int i = 0;
            int p1 = left;
            int p2 = mid +1;
            while (p1 <= mid && p2 <= right){
                temp[i++] = arr[p1] < arr[p2] ? arr[p1++]:arr[p2++];
            }
            while (p1 <= mid){
                temp[i++] = arr[p1++];
            }
            while (p2 <= right){
                temp[i++] = arr[p2++];
            }
            for (i = 0; i < temp.length; i++) {
                arr[left + i] = temp[i];
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 34,12,114,43,1455,21,532,321};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
