import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.printf("Zdanie:%s%n", line);
        int number = scanner.nextInt();
        System.out.printf("Liczba: %d%n", number);
        double a = scanner.nextDouble();
        System.out.println(a);
        scanner.close();
        var b = 4;
    }
}
