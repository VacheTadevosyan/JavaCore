package homeworks.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray da1 = new DynamicArray();

        da1.add(5);
        da1.add(10);
        da1.add(15);


        DynamicArray da2 = new DynamicArray();

        da2.add(5);
        da2.add(10);
        da2.add(15);

        System.out.println(da2.getByIndex(0));
        System.out.println(da2.getByIndex(2));
        System.out.println(da2.getByIndex(5));
        System.out.println(da2.getByIndex(-1));


        DynamicArray da3 = new DynamicArray();

        da3.add(4);
        da3.add(8);
        da3.add(12);

        da3.print();

        System.out.println();
        System.out.println("----------Test1----------");

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        System.out.println();
        System.out.println("----------Test2----------");
        for (int i = 6; i < 16; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        System.out.println();
        System.out.println("----------Test3----------");

        for (int i = 16; i < 26; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        System.out.println();
        System.out.println("----------Test4----------");

        System.out.println(dynamicArray.getByIndex(0));
        System.out.println(dynamicArray.getByIndex(24));
        System.out.println(dynamicArray.getByIndex(-1));
        System.out.println(dynamicArray.getByIndex(50));

    }

}
