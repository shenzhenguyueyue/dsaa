package com.guyueyue.sort;

/**
 * 选择排序
 */
public class SelectSort extends Sort {
    public SelectSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int length = this.arr.length;
        for (int i = 0; i < length; i++) {
            int key = i;
            for (int j = i + 1; j < length; j++) {
                if (this.arr[j] < this.arr[key]) {
                    key = j;
                }
            }

            exch(i, key);
        }
    }

}
