package com.guyueyue.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 2, 7, 9, 8};
        //选择排序
//        SelectSort selectSort = new SelectSort(arr);
//        selectSort.sort();
//        selectSort.print();
        InsertSort insertSort = new InsertSort(arr);
        insertSort.sort();
        insertSort.print();

    }
}
