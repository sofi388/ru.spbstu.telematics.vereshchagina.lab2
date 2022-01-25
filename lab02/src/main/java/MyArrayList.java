public class MyArrayList<T> implements Iterable<T>{
    private final int SIZE = 16;
    private final int CUTRATE = 4;
    private Object[] array = new Object[SIZE];
    private int pointer = 0;
    private T value;
    // resize
    private void resize(int NewLength) {
        Object[] newArray = new Object[NewLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    // add
    void add(T a) {
        resize(array.length + 1);
        array[pointer++] = a;
    }

    // get
    public T get(int index) {
        return (T) array[index];
    }

    // size
    public int size() {
        return pointer;
    }


    // remove
    void removeByIndex(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > SIZE && pointer < array.length / CUTRATE)
            resize(array.length / 2);

    }
    // out / contains
    void out() {
        for (int i = 0; i < array.length; i++) {
            if (array[i]!= null)
                System.out.println(array[i]);

        }
    }
    
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return currentIndex < pointer && array[currentIndex] != null;
            }

            public T next() {
                return (T)array[currentIndex++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    
}

