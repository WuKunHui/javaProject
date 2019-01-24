package Day12_22;
interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("³ÔÆ»¹û");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("³ÔéÙ×Ó");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        Fruit f=null;
        if("apple".equals(className)){
            f=new Apple();
        }
        if("orange".equals(className)){
            f=new Orange();
        }
        return f;
    }
}
public class InterfaceCaseDemo05 {
    public static void main(String[] args) {
        if(args.length<=0){
            return;
        }
        Fruit f=Factory.getInstance(args[0]);
        if(f!=null){
            f.eat();
        }
    }
}
