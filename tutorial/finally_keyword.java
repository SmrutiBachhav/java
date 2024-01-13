class finally_keyword{
    // public static int greet(){
    //     try{
    //         int a=50;
    //         int b=0;
    //         int c=a/b;
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    //     finally{
    //         System.out.println("I am here!");
    //     }
    //     return 0;
    // }
    
 public static void main (String[]args){
    // int g =greet();
    // System.out.println(g);
    int a= 67;
    int b=9;
    while(true){
        try{
            System.out.println(a/b);
            //break;
        }
        catch(Exception c){
            System.out.println(c);
            break;
        }
        finally{
            System.out.println("I am finally for value of b="+b);
        }
        b--;
    } 
    //try can't be use without check but can be use with finally   
    try{
        System.out.println(5/0);
    }
    finally{
        System.out.println("I am finally here!");
    }
 }   
}