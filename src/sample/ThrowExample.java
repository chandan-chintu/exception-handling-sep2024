package sample;

import com.sun.jdi.InternalException;

public class ThrowExample {
    public void demo(){
        try{
            System.out.println("Before throwing exception manually");
            int a =10;
            if(a==10) {
                throw new Exception("some random exception");
            }
           // System.out.println("after throwing exception manually");- we cannot write this
        } catch (Exception e1){
            System.out.println("Ecxception occured : "+e1.getMessage());
        }
        System.out.println("after try catch and throw");
    }

    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        throwExample.demo();
    }
}
