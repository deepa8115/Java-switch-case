package switchcase;
import java.util.Scanner;
public class Switchcase{
  public static void main(String[] args)
  {
     int choice;
     System.out.println("pick one:1.Hi \t2. Hello \t3. How are you \t");
     Scanner s=new Scanner(System.in);
     choice=s.nextInt();
     switch(choice)
     {
       case 1: System.out.println("You said Hi");
               break;
       case 2: System.out.println("You said Hello");
               break;
       case 3: System.out.println("You said How are you");
               break;
       default: System.out.println("Invalid choice.");
     }
   }
}
