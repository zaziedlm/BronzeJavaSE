public class Main {
    public static void main(String[] args) {
        int a = 3;
        for(int i = 0;  i < 3; i++) {
            int total = 0;
            total += a;
        }
        System.out.println(total);  // total cannot be resolved to a variable
    }
}
