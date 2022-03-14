package bsu.comp250;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        int answer = sumRecursive(n);
        System.out.println(answer);
    }

    private static int sumRecursive(int n) {
        if (n < 2)
            return n;
        else
            return n + sumRecursive(n-1);
    }
}
