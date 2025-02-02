package exception_handling_example;

public class Proper_Sequence_example {

	public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Catch block of ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Catch block of RuntimeException");
        } catch (Exception e) {
            System.out.println("Catch block of Exception");
        } catch (Throwable t) {
            System.out.println("Catch block of Throwable");
        }
    }
}

