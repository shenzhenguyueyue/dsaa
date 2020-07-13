package com.guyueyue.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 9, 10, 5, 7, 9, 8};
        //选择排序
//        SelectSort selectSort = new SelectSort(arr);
//        selectSort.sort();
//        selectSort.print();
        //插入排序
//        InsertSort insertSort = new InsertSort(arr);
//        insertSort.sort();
//        insertSort.print();
        //希尔排序
        ShellSort shellSort = new ShellSort(arr);
        shellSort.sort();
        shellSort.print();

    }
}
