class try_catch_exception{
    public static void main (String[]args){
        int a=6000;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The result is: " + c);
        }
        catch(Exception e){
            System.out.println("We failes to divide. Reason:");
            System.out.println(e);
        }
    }
}