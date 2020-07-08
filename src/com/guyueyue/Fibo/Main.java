package com.guyueyue.Fibo;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib(0));
    }

    public static int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1 || N == 2) {
            return 1;
        }

        int result = 0;
        int p, q;
        p = 1;
        q = 1;
        for (int i = 3; i <= N; i++) {
            result = p + q;
            p      = q;
            q      = result;
        }

        return result;
    }
}
