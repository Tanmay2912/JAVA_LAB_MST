import java.lang.ArithmeticException;
public class exception {
    public static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("Preson is not eligible"); 
        }
        else {
            System.out.println("Go and vote");
        }
    }
    public static void main(String[] args) {
        validate(12);
        System.out.println("Code ends");
    }
}
