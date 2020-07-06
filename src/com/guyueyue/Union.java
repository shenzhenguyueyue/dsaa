package src.com.guyueyue;

public class Union {
    private int count;
    private int[] arr;

    public Union(int leng) {
        this.count = leng;
        this.arr = new int[leng];
        for (int i = 1; i <=leng; i++) {
            this.arr[i] = i;
        }
    }

    public boolean find(int p,int q){
        return this.arr[p] == this.arr[q];
    }

    public void connect(int p,int q){
        if(this.find(p,q)){
            return;
        }

        this.arr[p] = this.arr[q];
        this.count--;
    }

    public int getCount(){
        return this.count;
    }
}


