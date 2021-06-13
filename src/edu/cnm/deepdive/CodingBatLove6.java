package edu.cnm.deepdive;

/*
Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6
 */

public class CodingBatLove6 {

  public static void main(String[] args) {
    System.out.printf("with the numbers %s and %s, the outcome is " + love6(6, 4) + "\n", "6", "4");
    System.out.printf("with the numbers %s and %s, the outcome is " + love6(4, 5)+ "\n", "4", "5");
    System.out.printf("with the numbers %s and %s, the outcome is " + love6(1, 5)+ "\n", "1", "5");
  }


  public static boolean love6(int a, int b) {
    return (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);
  }

}
