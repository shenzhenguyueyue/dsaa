package src.com.guyueyue;

public class Main {
    public static void main(String[] args) {


//        char[][] arr = new char {
//            ['1', '1', '1', '1', '0'],
//            ["1", "1", "0", "1", "0"],
//        ["1", "1", "0", "0", "0"],
//        ["0", "0", "0", "0", "0"]
//        };
    }
}


class Solution {
    class UnionFind {
        private int count;
        private int[] arr;

        public UnionFind(int leng) {
            this.count = leng;
            this.arr = new int[leng];
            for (int i = 1; i <= leng; i++) {
                this.arr[i] = i;
            }
        }

        public boolean find(int p, int q) {
            return this.arr[p] == this.arr[q];
        }

        public void union(int p, int q) {
            if (this.find(p, q)) {
                return;
            }

            this.arr[p] = this.arr[q];
            this.count--;
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
        UnionFind uf = new UnionFind(nr * nc);
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '0';
                    if (r - 1 >= 0 && grid[r - 1][c] == '1') {
                        uf.union(r * nc + c, (r - 1) * nc + c);
                    }
                    if (r + 1 < nr && grid[r + 1][c] == '1') {
                        uf.union(r * nc + c, (r + 1) * nc + c);
                    }
                    if (c - 1 >= 0 && grid[r][c - 1] == '1') {
                        uf.union(r * nc + c, r * nc + c - 1);
                    }
                    if (c + 1 < nc && grid[r][c + 1] == '1') {
                        uf.union(r * nc + c, r * nc + c + 1);
                    }
                }
            }
        }

        return uf.getCount();
    }
}