package Task1;
import java.util.*;
public class AddOptionforMultiple {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      Random randonum= new Random();
   int m=randonum.nextInt(100)+1;
      System.out.println(m);
      int n=0;
      int numberoftries=0;
      boolean playagain=true;
      while(playagain){
         while(n!=m){
            System.out.println("Enter your Guess number:");
            n=sc.nextInt();
            numberoftries++;
            if(n>m){
               System.out.println("Guess is too high!try again");
            }
            else if(n<m){
               System.out.println("Guess is too low!try again");
            }
            else{
                  System.out.println("Both Guess number and generate number are correct");
               }
         }
         System.out.println("Do you want to play again? (yes/no)");
         String mul = sc.next();
         if (!mul.equalsIgnoreCase("yes")) {
             playagain = false;
      }
   
    }

   }
}