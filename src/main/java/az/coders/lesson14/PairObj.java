package az.coders.lesson14;

public class PairObj<K, V> implements Pair {

    K k;
    V v;

    public PairObj(K k,V v){
        this.k = k;
        this.v = v;
    }

    @Override
    public K getKey() {
        return k;
    }

    @Override
    public V getValue() {
        return v;
    }
}

class Mainn {
    public static void main(String[] args) {
        PairObj<String, Integer> pairObj = new PairObj<>("Matin",1);

        System.out.println(pairObj.getKey());
        System.out.println(pairObj.getValue());
    }
}
