import java.util.Scanner;
class invalid_input extends Exception{
    public String toString(){
        return "please select function from\n+ to add \n- to substract \n* to multiply\n/ to divide";
    }
    public String getMessage(){
        return "Invalid input!";
    }
}
class cannot_divide_by0 extends Exception{
    public String toString(){
        return "try any another number";
    }
    public String getMessage(){
        return "can't divide by zero!";
    }
}
class MAX_input_exceeds extends Exception{
    public String toString(){
        return "Choose number from 0 to 100000";
    }
    public String getMessage(){
        return "Maximum input range exceeds!";
    }
}
class MAX_multiplyinput_exceeds extends Exception{
    public String toString(){
        return "Choose number from 0 to 7000";
    }
    public String getMessage(){
        return "Maximum input number range exceeds!";
    }

}
class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        boolean run_again=true;
        while(run_again){
            System.out.println("enter number 1");
            double num1=sc.nextDouble();
            System.out.println("enter number 2");
            double num2=sc.nextDouble();
            System.out.println("Enter fuction from\n+ to add \n- to substract \n* to multiply\n/ to divide");
            String func=sc.next();
            String [] oper={"+","-","*","/"};
            for(int i=0;i<oper.length;i++){
                if(func!=oper[i]){
                    try{
                        throw new invalid_input();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                        System.out.println(e.toString());
                    }
                }
            }
            switch(func){
                case "+":
                    if(num1>=100000 && num2>=100000){
                        try{
                            throw new MAX_input_exceeds();
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                            System.out.println(e.toString());
                        }
                    }
                    else{
                        double ares=num1+num2;
                        System.out.printf("Addition of two given numbers %f and %f is %f",num1,num2,ares);
                    }
                    break;
                case "-":
                    if(num1>=100000 && num2>=100000){
                        try{
                            throw new MAX_input_exceeds();
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                            System.out.println(e.toString());
                        }
                    }
                    else{
                        double sres=num1-num2;
                        System.out.printf("Subtraction of two given numbers %f and %f is %f",num1,num2,sres);
                    }
                    break;
                case "*":
                    if (num1>=7000 && num2>=7000){
                        try{
                            throw new MAX_multiplyinput_exceeds();
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                            System.out.println(e.toString());
                        }
                    }
                    else{
                        double mres=num1*num2;
                        System.out.printf("Multiplication of two given numbers %f and %f is %f",num1,num2,mres);
            
                    }
                    break;
                case "/":
                if(num2==0){
                    try{
                        throw new cannot_divide_by0();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                        System.out.println(e.toString());               
                    }
                }
                else{ 
                    double dres=num1/num2;
                    System.out.printf("Division of two given numbers %f and %f is %f",num1,num2,dres);
                    
                }
                break;
            }
        System.out.println();
        System.out.println("Want to run again? Y/N/y/n");
        String c=sc.next();

        if(c=="N"){
            run_again=false;
        } 

        }

        
        
    }
}