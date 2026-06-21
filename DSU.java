// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DisjointSetUnion {
    int n;
    List<Integer> parent;
    List<Integer> rank;
    DisjointSetUnion(int n) {
        this.n = n;
        parent = new ArrayList<>();
        rank = new ArrayList<>();
        for (int i=0;i<n;i++) {
            parent.add(i);
            rank.add(0);
        }
    }
    void unionByRank(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if(parA == parB) return;
        else if (rank.get(parA) == rank.get(parB)) {
            parent.set(parB,parA);
            rank.set(parA,rank.get(parA)+1);
        }
        else if (rank.get(parA) > rank.get(parB)) {
            parent.set(parB,parA);
        }
        else {
            parent.set(parA,parB);
        }
    }
    
    int find(int x) {
        if(parent.get(x) == x) return x;
        // return find(parent.get(x));
        // path compression
        int ultimateParent = find(parent.get(x));
        parent.set(x,ultimateParent);
        return ultimateParent;
    }
    
    void getInfo() {
        System.out.println("PARENT");
        for(int elt : parent) {
            System.out.print(elt+" ");
        }
        System.out.println("\nRANK");
        for(int elt : rank) {
            System.out.print(elt+" ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(6);
        dsu.unionByRank(0,2);
        System.out.println(dsu.find(2));
        dsu.unionByRank(1,3);
        dsu.unionByRank(2,5);
        dsu.unionByRank(0,3);
        System.out.println(dsu.find(2));
        dsu.unionByRank(0,4);
        System.out.println("________");
        dsu.getInfo();
    }
}