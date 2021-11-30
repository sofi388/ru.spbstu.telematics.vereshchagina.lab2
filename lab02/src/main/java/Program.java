public class Program {
    public static void main(String[] args) {
        System.out.println("Lab #2 - Array List");

        System.out.println("\n1. Make list");
        MyArrayList <String> listFirst = new MyArrayList<>();
        listFirst.add("aaa");
        listFirst.add("bbb");
        listFirst.add("ccc");
        listFirst.out();

        System.out.println("\n2. Remove by index - 1");
        listFirst.removeByIndex(1);
        listFirst.out();

        System.out.println("\n3. Get by index - 1");
        String str1 = listFirst.get(1);
        System.out.print(str1);

        System.out.println("\n4. Add string - Hello");
        listFirst.add("Hello");
        listFirst.out();

        System.out.println("\n5. Print size");
        int size = listFirst.size();
        System.out.println(size);

    }
}
