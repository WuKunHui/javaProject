package Day12_19;
class IntArray{
    private int nArray[];
    public IntArray(int nNum){
        nArray=new int[nNum];
    }
    public boolean AddData(int nValue){
        nArray=new int[nValue];
        if(this.nArray.length<nArray[nValue]){
            return false;
        }
        return true;
    }
    public int Print(int nNum){
        return nArray[nNum];
    }
}
//class SortIntArray extends IntArray{
//java.util.Arrays
//}
//class ReIntArray extends IntArray{


public class Demo {
    public static void main(String[] args) {
        IntArray arr=new IntArray(213);
        arr.AddData(356);
        arr.Print(23);
    }
}
