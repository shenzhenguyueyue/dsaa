package com.guyueyue.sort;

/**
 * 归并排序实现：包含“自顶向下”和“自底向上”
 */
public class MergeSort {
    private int[] arr;
    private int[] aux;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * 归并操作
     */
    private void merge(int low, int mid, int high) {
//        int i = low,j = mid + 1;
//        for (int k = low; k <=  high ; k++) {
//            aux[k] = arr[k];
//        }
//
//        for (int k = low; k <= high; k++){
//            if(i > mid){
//                arr[k] = arr[j];
//                j++;
//            }else if(){
//
//            }
//        }

        //试一试自己实现
        int i = low, j = mid + 1;
    }
}
