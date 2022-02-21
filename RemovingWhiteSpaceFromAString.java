package GracelaRemovingWhiteSpaceFromAString;
import java.util.Scanner;
public class RemovingWhiteSpaceFromAString {
 private static Scanner sc;

  public static void main(String[] args) {
   
   sc= new Scanner(System.in);
      
   System.out.println("Enter String to Remove White Spaces = hello world");
   String strl = sc.nextLine();
   System.out.println("Original String = " + strl);
   
   String str2 = strl.replaceAll("\\s", "");
   System.out.println("Final String = " + str2);
   
   
   
  }
}
