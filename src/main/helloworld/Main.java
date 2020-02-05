package main.helloworld;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Dragana");

        /*  int age = 5;

        if (age > 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }

        System.out.print("Unesite broj godina.");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();

        if (userAge > 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }

        System.out.println("Korisnik je uneo:" + userAge); */
        System.out.print("Unesite broj godina.");
        Scanner input2 = new Scanner(System.in);
        int personAge = input2.nextInt();

        if (personAge <= 0 && personAge > 150) {
            System.out.println("Invalid");
        } else if (personAge > 0 && personAge <= 5) {
            System.out.println("Osoba je beba");
        } else if (personAge <= 11) {
            System.out.println("Osoba je dete");
        } else if (personAge <= 17) {
            System.out.println("Osoba je tinejdzer");
        } else if (personAge >= 18) {
            System.out.println("Osoba je punoletna");

        }
    }

}
