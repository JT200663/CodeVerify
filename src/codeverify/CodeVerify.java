
package codeverify;

import java.util.Random;
import java.util.Scanner;

public class CodeVerify {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter a code");
        String code = input.next();
        int x = rand.nextInt(code.length());
        int y = rand.nextInt(code.length());
        System.out.println("Enter the "+(x+1)+"th and "+(y+1)+"th char of your code");
        char p = input.next().charAt(0);
        char z = input.next().charAt(0);
        if ((p == code.charAt(x))&&(z == code.charAt(y))){
            System.out.println("\u001B[32m"+"You Legend");
        } else {
            System.out.println("\u001B[31m"+"oh my that simply will not do!");
        }
        

    }
    
}
