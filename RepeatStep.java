package Task1;
import java.util.*;
public class RepeatStep {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m;
    Random randomnum =new Random();
    m=randomnum.nextInt(100)+1;
    int numberoftries=0;
    int n=0;
    while(n!=m){
    System.out.println("Enter your guess number:");
    n=sc.nextInt();
        numberoftries++;
        if(n>m){
            System.out.println("Guess number is too high");
         }
        else if(n<m){
            System.out.println("Guess number is too low");
        }
        else {
            System.out.println("Both Guess number and generate number are same"+numberoftries+" ");
            break;
        }
    }
    // sc.close();
}
}