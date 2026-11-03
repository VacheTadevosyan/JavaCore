package homeworks.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (size == array.length) {
            extend();
        }

        array[size] = value;
        size++;
    }

    private void extend() {
        int[] tmp = new int[size + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }


    public int getByIndex(int index) {
        if (index >= 0 && index < size){
            return array[index];
        }else{
            return -1;
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}