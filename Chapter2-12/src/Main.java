public class Main {
    public static void main(String[] args) {
        final String COLOR = "blue";
        // other code
        COLOR = "red";  // The final local variable COLOR cannot be assigned.
                        // It must be blank and not using a compound assignment
        System.out.println(COLOR);
    }
}
