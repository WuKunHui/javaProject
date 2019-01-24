package Day11_29;

public class MethoDemo03 {
    public static void main(String[] args) {
        int one = add(10, 20);
        float two = add(10.3f, 13.3f);
        int three = add(10, 20, 30);
        System.out.println("addOne的计算结果：" + one);
        System.out.println("addTwo的计算结果：" + two);
        System.out.println("addThree的计算结果：" + three);
    }

    public static int add(int x, int y) {
        int temp = 0;
        temp = x + y;
        return temp;
    }

    public static float add(float x, float y) {
        float temp = 0;
        temp = x + y;
        return temp;
    }

    public static int add(int x, int y, int z) {
        int temp = 0;
        temp = x + y + z;
        return temp;
    }
}
