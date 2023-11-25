package folder.folderl1.folderl2;

class  Calculator{
    
    Calculator(int a,int b){
        
        System.out.println(a+b);
    }
}
public class problem2{
    protected int proInt=9;
    int defInt=10;
    public static void main (String[]args){
        Calculator c=new Calculator(4,6);
    }
}