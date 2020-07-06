package com.guyueyue;

public class Main {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution solution = new Solution();
        System.out.println(solution.numIslands(arr));
    }
}


class Solution {
    class UnionFind {
        private int count;
        private int[] arr;

        public UnionFind(char[][] grid) {
            int leng = grid.length * grid[0].length;
            this.arr = new int[leng];
            for (int i = 0; i < leng; i++) {
                this.arr[i] = i;
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == '1'){
                        this.count++;
                    }
                }
            }
        }

        public int find(int p){
            return this.arr[p];
        }

        public void union(int p,int q){
            int pID = find(p);
            int qID = find(q);
            if(pID == qID){
                return;
            }

            for (int i = 0; i < this.arr.length; i++) {
                if(this.arr[i] == pID){
                    this.arr[i] = qID;
                }
            }

            count--;
        }

        public int getCount() {
            return this.count;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        UnionFind uf = new UnionFind(grid);
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '0';
                    if (r - 1 >= 0 && grid[r - 1][c] == '1') {//上
                        uf.union(r * nc + c, (r - 1) * nc + c);
                    }
                    if (r + 1 < nr && grid[r + 1][c] == '1') {//下
                        uf.union(r * nc + c, (r + 1) * nc + c);
                    }
                    if (c - 1 >= 0 && grid[r][c - 1] == '1') {//左
                        uf.union(r * nc + c, r * nc + c - 1);
                    }
                    if (c + 1 < nc && grid[r][c + 1] == '1') {//右
                        uf.union(r * nc + c, r * nc + c + 1);
                    }
                }
            }
        }

        return uf.getCount();
    }
}