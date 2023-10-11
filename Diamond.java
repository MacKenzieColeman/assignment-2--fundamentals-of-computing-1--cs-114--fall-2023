import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a Number Here: ");
    int numberString = scan.nextInt();

    if(numberString % 2 == 0)
      System.out.print("even\n");

    else
      System.out.print("odd\n");
  }
}
