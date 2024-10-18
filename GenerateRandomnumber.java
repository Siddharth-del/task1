package Task1;

import java.util.Random;
public class GenerateRandomnumber {
    public static void main(String[] args) {
        int num;
        Random randomnum= new Random();
        num=randomnum.nextInt(100);
        System.out.println(num);
    }
}
