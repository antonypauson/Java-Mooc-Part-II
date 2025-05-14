public class HashMap <K,V>{
    private List<Pair<K,V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new List<>();
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];

        int index = -1;
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key,value));
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    }

    public V get (K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }
}
