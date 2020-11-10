//The Integer.valueOf command converts a string to an integer

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Write a value ");
    int value = Integer.valueOf(scanner.nextLine());
    System.out.println("You wrote " + value);
  }
}
