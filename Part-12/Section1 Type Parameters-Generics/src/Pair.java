public class Pair <T,K>{
    private T first;
    private K second;

    public void setValues(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public K getSecond() {
        return this.second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pairs = new Pair<>();
        pairs.setValues("WOWO", 121);
        System.out.println(pairs.getFirst());
        System.out.println(pairs.getSecond());
    }

}
