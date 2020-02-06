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
 /*  System.out.print("Unesite broj godina.");
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
         */
        System.out.println("*********************************");

        Scanner input3 = new Scanner(System.in);
        int dayInWeek = 0;
        String day = null;

        do {
            System.out.println("Please enter a nummber for a day in week, between 1 do 7");
            dayInWeek = input3.nextInt();
        } while (dayInWeek < 0 || dayInWeek > 7);

        switch (dayInWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
        }
        System.out.println("Today is " + day);
    }
}
