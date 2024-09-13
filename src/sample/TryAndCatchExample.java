package sample;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a=10;
        int res=0;
        try{
            //code to mointor
            System.out.println("before exception occurs in try block");
            res = a/0;
            System.out.println("after exception occurs in try block");
        } catch (ArithmeticException e1){
            // handle the exception
            System.out.println("Exception occured : "+e1.getMessage());
        }
        System.out.println("after try and catch block");
        System.out.println("a is "+a);
    }
}
