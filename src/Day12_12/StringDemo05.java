package Day12_12;

public class StringDemo05 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3=str2;
        System.out.println("str1 equals str2-->"+(str1.equals(str2)));
        System.out.println("str1 equals str3-->"+(str1.equals(str3)));
        System.out.println("str2 equals str3-->"+(str2.equals(str3)));
    }
}
