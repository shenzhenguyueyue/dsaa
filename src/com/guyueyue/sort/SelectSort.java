package com.guyueyue.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    private int[] arr;

    public SelectSort(int[] arr) {
        this.arr = arr;
    }

    public void exch(int p, int q) {
        int temp = this.arr[p];
        this.arr[p] = this.arr[q];
        this.arr[q] = temp;
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

    public void print() {
        System.out.println(Arrays.toString(this.arr));
    }
}
