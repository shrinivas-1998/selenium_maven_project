package operators;

public class graetest_from_four_numbers {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 35;
        int d = 38;

        // Using the ternary operator to determine the greatest number
        int r1 = (a > b) ? a : b;
        int r2 = (r1 > c) ? r1 : c;
        int r3 = (r2 > d) ? r2 : d;

        // Print the greatest number
        System.out.println(r3);
    }
}

