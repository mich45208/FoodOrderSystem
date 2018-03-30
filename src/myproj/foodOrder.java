package myproj;

import java.io.File;
import java.util.Scanner;

public class foodOrder {
    public static void main(String[] args) {
        Scanner menuIn = new Scanner(System.in);
        String menuName = menuIn.nextLine();
        Menu menu = new Menu(menuName);
        File menuDir = new File(menuName);
        if (menuDir.mkdir()) {
            System.out.println("Menu: " + menuName + "is created. ");
        } else {
            System.out.println("Menu: " + menuName + " already exist.");
        }
        boolean end = false;
        System.out.println("Command: ");
        System.out.println("1. Check menu already existed.");
        System.out.println("2. Delete a menu.");
        System.out.println("3. Create a menu.");
        System.out.println("4. End");
        while (!end) {
            
        }

        while (!end) {
            System.out.println();
            System.out.println("Command:");
            System.out.println("1. put: inset new food to menu");
            System.out.println("2. get: get food info from menu");
            System.out.println("3. check: check if a food is already in menu");
            System.out.println("4. menu: check every items in menu");
            System.out.println("5. end: finish. " + "\n");

            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            switch (command){
                case "menu":
                    break;
                case "get":
                    System.out.println("what is the food?");
                    Scanner foodOut = new Scanner(System.in);
                    String food = foodOut.nextLine();
                    System.out.println("food info is: ");
                    menu.get(food);
                    break;
                case "check":
                    System.out.println("what is food name");
                    Scanner foodCheckIn = new Scanner(System.in);
                    String foodCheckInput = foodCheckIn.nextLine();
                    menu.contains(foodCheckInput);
                    break;
                case "put":
                    System.out.println("what is food name");
                    Scanner foodIn = new Scanner(System.in);
                    String foodInput = foodIn.nextLine();
                    System.out.println("what is food info");
                    Scanner infoIn = new Scanner(System.in);
                    String infoInput = infoIn.nextLine();
                    menu.put(foodInput, infoInput);
                    break;
                case "end":
                    end = true;
                    break;
            }
        }

    }
}
