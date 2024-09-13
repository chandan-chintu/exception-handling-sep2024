package sample;

public class MultipleCatchException {
    public static void main(String[] args) {
        int a=10;
        int res=0;
        try{
            //code to mointor
            System.out.println("before exception occurs in try block");
            res = a/10;
            int arr[] ={23,34,45};
            System.out.println("Array 5th index is  : "+arr[5]);
            System.out.println("after exception occurs in try block");
        } catch (ArithmeticException e1){
            // handle the exception
            System.out.println("Exception occured : "+e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2){
            // handle the exception
            System.out.println("Exception occured : "+e2.getMessage());
        }
        System.out.println("after try and catch block");
        System.out.println("a is "+a);
    }
}
