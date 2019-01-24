package Day12_29;
class Point1<T>{
    private T var;
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var=var;
    }
}
public class GenericsDemo06 {
    public static void main(String[] args) {
        Point1<String>p=new Point1<String>();
        p.setVar("YJSJ");
        System.out.println(p.getVar().length());
    }
}
