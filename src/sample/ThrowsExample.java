package sample;

import java.util.Scanner;

public class ThrowsExample {

    public void demo() throws IllegalAccessException, InterruptedException{
        System.out.println("inside demo method");
        Scanner s =  new Scanner(System.in);
        System.out.println("enter a value : ");
        int a = s.nextInt();
        if(a==1){
            throw new RuntimeException("a value is 1 and it is unchecked exception");
        }
        if(a==2){
            throw new ArithmeticException("a value is 2 and it is unchecked exception");
        }
        if(a==3){
            throw new IllegalAccessException("a value is 3 and it is checked exception");
        }
        if(a==4){
            throw new InterruptedException("a value is 4 and it is checked exception");
        }
    }

    public static void main(String[] args) {
        try {
            ThrowsExample throwsExample = new ThrowsExample();
            throwsExample.demo();
        } catch (Exception e) {
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
