package Day12_12;

public class StringAPIDemo12 {
    public static void main(String[] args) {
        String str = "hello";
        String newStr = str.replaceAll("l", "x");
        System.out.println("替换之后的结果：" + newStr);
    }
}
