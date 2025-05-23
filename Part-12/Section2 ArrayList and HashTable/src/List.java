public class List <Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2; //new size
        Type[] newValues = (Type[]) new Object[newSize]; //new array
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i]; //adding elements to new array
        }

        this.values = newValues; //setting new array as old array
    }

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }

    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
    }
}
