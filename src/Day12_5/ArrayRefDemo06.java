package Day12_5;

public class ArrayRefDemo06 {
    public static void main(String[] args) {
        int i1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i2[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.arraycopy(i1, 3, i2, 1, 3);
        print(i2);
    }
    public static void print(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "\t");
        }
    }
}
