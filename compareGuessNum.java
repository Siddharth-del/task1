import java.util.Random;
import java.util.*;
public class compareGuessNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Guess number for generated number:");
        int n=sc.nextInt();
        int m;
        Random s= new Random();
        m=s.nextInt(100);
        System.out.println("Generate number:"+m);
        if(m==n){
            System.out.println("Guess is correct");
        }
        else if(m>n){
            System.out.println("Guess is too low");
        }
       else{
        System.out.println("Guess is too high");
       }
    }
    
}
