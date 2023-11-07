package MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T value) {
        rebalance();
        data[size] = value;
        size++;
    }

    public void rebalance() {
        if (data.length == size) {
            data = Arrays.copyOf(data, data.length + 6);
        }
    }

    public T get(int index) {
        try {
            return (T) data[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Incorrect index value. Size of array is less then index you want to get!");
        }
        return (T) (null);
    }

    public void remove(int index) {
        try {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Incorrect index value. Size of array is less then index you want to get!");
        }
    }

    public void  clear(){
        data = new Object[10];
    }

    public int size(){
        int size =0;
        for (Object el :
                data) {
            if(el!=null){
                size++;
            }
        }
        return size;
    }
}
