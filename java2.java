import java.util.Scanner;

public class AddAndCheckEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;

    if (sum % 2 == 0) {
      System.out.println("The sum is even: " + sum);
    } else {
      System.out.println("The sum is odd: " + sum);
    }
  }
}
