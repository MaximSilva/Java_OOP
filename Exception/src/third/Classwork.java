package third;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Classwork {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    File file = new File("price.txt");
    Integer price = null;
    try {
      Scanner scan = new Scanner(file);
      price = scan.nextInt();
      scan.close();
      if (price < 0) {
        price = null;
        throw new NegativePriceException();
      }

    } catch (IOException e) {
      System.out.println("File not found");
    } catch (InputMismatchException e) {
      System.out.println("Error file format");
    } catch (NegativePriceException e) {
      System.out.println("Negative price");
    } finally {
      System.out.println("Thank you for using our service :) ");
    }
    System.out.println("price = " + price);
  }

}
