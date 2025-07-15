package assignment;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String nat;
        System.out.println("Enter Your Age");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Eneter Your Nationality");
        nat = input.nextLine();
        if (age >= 18 && "egyptian".equals(nat)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
