package operators;

public class greatest_from_three_numbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        
        // Using the ternary operator to determine the greatest number
        int result1 = (a > b) ? a : b;
        int result2 = (result1 > c) ? result1 : c;
        
        // Print the greatest number
        System.out.println(result2);
    }

}

