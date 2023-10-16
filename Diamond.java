import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a Number Here: ");
    int numberString = scan.nextInt();

    if(numberString % 2 == 0){
      //top part of even diamond
      for(int i = 1; i <= numberString / 2 + 1; i++) {
        for(int spaces = 1; spaces <= numberString / 2 + 1 - i; spaces++) {
          System.out.print(" ");
        }

        for(int stars = 1; stars <= 2 * i - 1; stars += 2) {
          System.out.print("* ");
        }

        System.out.println();

      }
      //bottom part of even diamond
      for(int i = numberString / 2; i >= 1; i--) {
        for(int spaces = 1; spaces <= numberString / 2 + 1 - i; spaces++) {
          System.out.print(" ");
        }

        for(int stars = 1; stars <= 2 * i - 1; stars+= 2) {
          System.out.print("* ");
        }

        System.out.println();
      }
    }

    if(numberString % 2 != 0) {
      //top part of odd diamond
      for(int i = 1; i <= numberString / 2 + 1; i++) {
        for(int spaces = 1; spaces <= numberString / 2 + 1 - i; spaces++) {
          System.out.print(" ");
        }

        for(int stars = 1; stars <= 2 * i - 1; stars++) {
          System.out.print("*");
        }

        System.out.println();
      }
      //bottom part of odd diamond
      for(int i = numberString / 2; i >= 1; i--) {
        for(int spaces = 1; spaces <= numberString / 2 + 1 - i; spaces++) {
          System.out.print(" ");
        }

        for(int stars = 1; stars <= 2 * i - 1; stars++) {
          System.out.print("*");
        }

        System.out.println();
      }
    }
  }
}
