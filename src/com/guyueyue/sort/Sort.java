package com.guyueyue.sort;

import java.util.Arrays;

public class Sort {
    protected int[] arr;

    public void exch(int p, int q) {
        int temp = this.arr[p];
        this.arr[p] = this.arr[q];
        this.arr[q] = temp;
    }

    public void print() {
        System.out.println(Arrays.toString(this.arr));
    }
}
