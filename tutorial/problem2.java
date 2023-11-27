package folder.folderl1.folderl2;
class  Calculator{
    Calculator(int a,int b){
        System.out.println("Sum of a and  b:"+(a+b));
    }
}
class Sc_calculator{
    Sc_calculator(int a,int b){
        System.out.println("Sum of sina and sinb :"+(Math.sin(a)+Math.sin(b)));
    }
}
class Hyb_calculator{
    Hyb_calculator(int a,int b){
        System.out.println("Sum of sina and b is :"+(Math.sin(a)+b));
    }
}
class problem2{
    protected int proInt=4;
    int defInt=11;
    public static void main (String[]args){
        Calculator c=new Calculator(4,6);
        Sc_calculator scc=new Sc_calculator(90,90);
        Hyb_calculator hybc =new Hyb_calculator(90,2);
    }
}