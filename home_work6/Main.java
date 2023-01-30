package home_work6;

public class Main {
    public static void main(String[] args) {
        int x = sum(6);
        System.out.println(x);
    }

    public static int sum(int z) {
        if (z > 0) {
            return z + sum(z - 1);
        }
                else {
            return 0;
        }
    }
}