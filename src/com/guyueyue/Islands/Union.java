package src.com.guyueyue.Islands;

class UnionFind {
    private int count;
    private int[] arr;
    private int[] sz;

    public UnionFind(char[][] grid) {
        int leng = grid.length * grid[0].length;
        this.arr = new int[leng];
        this.sz = new int[leng];
        for (int i = 0; i < leng; i++) {
            this.arr[i] = i;
            this.sz[i] = 1;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    this.count++;
                }
            }
        }
    }

    public int find(int p) {
        while (p != this.arr[p])
            p = this.arr[p];

        return p;
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) {
            return;
        }
        if(this.sz[pID] < this.sz[qID]){
            this.arr[pID] = qID;
            this.sz[qID] += this.sz[pID];
        }else {
            this.arr[qID] = pID;
            this.sz[pID] += this.sz[qID];
        }

        count--;
    }

    public int getCount() {
        return this.count;
    }
}

