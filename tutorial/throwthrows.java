import java.util.Scanner;
class NegativeRadiusException extends Exception{
    public String tostring(){
        return "Radius can't be negative!";
    }
    public String getMessage(){
        return "Radius can't be negative!";
    }
}
public class throwthrows{
    public static double area(double r) throws NegativeRadiusException{
        if (r<0){            
            throw new NegativeRadiusException();
        }
        double area=Math.PI*r*r;
        return area;
    }

public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter radius:");
    double r=sc.nextDouble();
    try{
        double ar=area(r);
        System.out.println(ar);
    }
    catch(Exception e){
        System.out.println("Exception-");
        System.out.println(e);
    }
}
}