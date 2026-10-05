package j26_37;

public class MyArrayList {
    private String[] arr = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(String s) {
        if (size == arr.length) {
            String[] newArr = new String[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }

        arr[size] = s;
        size++;
    }

    public String get(int i) {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index: " + i);
        return arr[i];
    }
}
