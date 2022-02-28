package GRACELACandyMachine;

import java.util.Scanner;
public class CANDYMACHINE {

public static void main(String [] args) {
  
  Scanner scan = new Scanner(System.in);
  System.out.print("Welcome to Gracela's Candy Machine!");
  scan.next();
  
 
  //String CandyMachine[] = {"Apple Candy", "Bcandy", "Ex-o", "Fresh", "Frutos", "Guava java", "Gummy bear", "Judges", "Maxx", "Snowbear", "V-fresh"};
  //String Price[] = {"30", "20", "24", "34", "20", "30", "50", "15", "15", "56", "30"};
  
  System.out.println("CandyMachine Items!");
  
  
  
  System.out.println("Apple Candy [30]");
  System.out.println("Bcandy [20]");
  System.out.println("Ex-o [24]");
  System.out.println("Fresh [34]");
  System.out.println("Frutos [20]");
  System.out.println("Guava java [30]");
  System.out.println("Gummy bear [50]");
  System.out.println("Judges [15]");
  System.out.println("Maxx [15]");
  System.out.println("Snowubear [56]");
  System.out.println("V-fresh [30]");
  
  System.out.println("What do you want to buy?");
   String name = scan.next();

  System.out.println("How many?");
  scan.next();
 
  System.out.println("Pay your bill");
   scan.next();
  
  System.out.println("This is your Items Ma'am/Sir!");
   scan.next();
   
  System.out.println("Thank you!, just come again!");
   scan.next();
  
  
  
  
}

}
  
