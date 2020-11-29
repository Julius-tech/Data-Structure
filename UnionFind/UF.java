public class UF{

  private int count;
  private int[] id;

  public UF(int N){
    count = N;
    points = new int[N];
    for(int i = 0; i < N; i++){
      id[i] = i;
    }
  }

  public int count(){
    return count;
  }

  public boolean connected(int p, int q){
    return find(p) == find(q);
  }

  public int find(int p){
    while(p != id[p]){
      p = id[p];
    }
    return p;
  }

  public void union(int p, int q){
    rootP = find(p);
    rootQ = find(q);
    if(rootP == rootQ){
      return;
    }
    id[rootP] rootQ;
    count--;
  }
}
