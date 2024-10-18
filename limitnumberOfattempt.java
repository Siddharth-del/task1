package Task1;

import java.util.*;
public class limitnumberOfattempt {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int m;
    Random randomnum= new Random();
      m=randomnum.nextInt(100);
      int n=0;
      System.out.println("Enter limit:");
      int limit=sc.nextInt();
      int numberOftries=0;
      while(n!=limit){
        System.out.println("Enter your Guess number:");
             n=sc.nextInt();
             numberOftries++;
             if(n>m){
                System.out.println("Guess number is too high !Try again");
             }
             else if(n<m){
                System.out.println("Guess number is too low !Try again");
             }
             else{
                System.out.println("Both Guess number and generate number are same"+numberOftries+" ");
                break;
             }

      }
    }
    
}
