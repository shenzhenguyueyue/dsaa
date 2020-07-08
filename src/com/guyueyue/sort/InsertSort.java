package com.guyueyue.sort;

/**
 * 插入排序实现
 */
public class InsertSort extends Sort {
    public InsertSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int length = this.arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    exch(j - 1, j);
                }
            }
        }
    }
}
