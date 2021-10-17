import java.util.Scanner;
public class GetPrimeNumbers {
    public static boolean isPrime(int number) {
        int remindCount = 1;
        if (number <= 1) {
            return false;
        } else {
            for (int index = 2; index <= number; index++) {
                if (number % index == 0) {
                    remeidCount++;
                    if (remeidCount > 2) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int end = scanner.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int index = start; index <= end; index++) {
            if (isPrime(index)) {
                System.out.println(index);
            }
        }
    }
    public static void main(String[] args) {
        myMethod();
    }
}