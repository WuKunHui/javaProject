 class Array{
    private int temp[];
    private int foot;
    public Array(int len){
        if(len>0){
            this.temp=new int[len];
        }else {
            this.temp=new int[1];
        }
    }
    public boolean add(int i){
        if(this.foot<this.temp.length){
            this.temp[foot]=i;
            this.foot++;
            return true;
        }else {
            return false;
        }
    }
    public    int[] getArray(){
        return this.temp;
    }
}
class SortArray extends Array{
    public SortArray(int len){
        super(len);
    }
    public int[] getArray(){
        java.util.Arrays.sort(super.getArray());
        return super.getArray();
    }
}
class ReverseArray extends Array{
    public ReverseArray(int len){
        super(len);
    }
    public int[] getArray(){
        int t[]=new int[super.getArray().length];
        int count=t.length-1;
        for (int x=0;x<t.length;x++){
            t[count]=super.getArray()[x];
            count--;
        }
        return t;
    }
}
public class Demo {
    public static void main(String[] args) {
        SortArray a=null;
        a=new SortArray(5);
        System.out.println(a.add(23)+"\t");
        System.out.println(a.add(21)+"\t");
        System.out.println(a.add(2)+"\t");
        System.out.println(a.add(42)+"\t");
        System.out.println(a.add(5)+"\t");
        System.out.println(a.add(6)+"\t");
        ptint(a.getArray());
    }
    public static void ptint(int i[]){
        for (int x=0;x<i.length;x++){
            System.out.println(i[x]+"¡¢");
        }
    }
}
