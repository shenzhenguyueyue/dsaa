package com.guyueyue.sort;

/**
 * 希尔排序
 */
public class ShellSort extends Sort {
    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int N = arr.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        while (h >= 1) {
            for (int i = 0; i < h; i++) {
                for (int j = i + h; j < N; j += h) {
                    if (arr[j] < arr[j - h]) {
                        exch(j, j - h);
                    }
                }
            }

            h--;
        }
    }
}
