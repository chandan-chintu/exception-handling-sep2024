package sample;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
           // throw new RuntimeException("some exception");
        } catch (Exception e){
            System.out.println("exception occured : "+e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
