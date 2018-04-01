package com.Mykyta;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static groceryList groceryList = new groceryList();

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
        }

        public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\n 0 - To print choice options ");
            System.out.println("\n 1 - To print the list of grocry items ");
            System.out.println("\n 2 - To add an item in the list ");
            System.out.println("\n 3 - To modify an item in the list ");
            System.out.println("\n 4 - To remove an item from the list ");
            System.out.println("\n 5 - To search for an item in the list ");
            System.out.println("\n 6 - To quit the application ");

    }

    public static void addItem() {
        System.out.println(" Please enter the grocery item" );
        groceryList.addGroceryItems(scanner.nextLine());


    }

    public static void modifyItem() {
        System.out.println(" Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGrocheryItem(itemNo-1, newItem);
    }


    public static void removeItem() {
        System.out.println(" Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem() {
        System.out.println(" Item for search for:");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list ");

        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }

    }

}
