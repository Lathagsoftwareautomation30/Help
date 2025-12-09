package Help;

import java.util.Scanner;

class bbb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        
        
        int age = sc.nextInt();    // reads 25, leaves newline behind

     //   sc.nextLine();             // clears the leftover newline 👈

      //  System.out.print("Enter your name: ");
        //String name = sc.nextLine();  // now reads actual name

     //   System.out.println("Your name is " + name + " and your age is " + age);
    }
}
