package owncustomizedexception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int numer = s.nextInt();
        try {
            if (numer == 0) {
                throw new MyOwnException("number is 0 enter some other value");
            }
            if (numer < 0) {
                throw new MyOwnException("number is less than 0 enter some other value", new RuntimeException("some error"));
            }
        } catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
