package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaring all variables
        Scanner keyboard = new Scanner(System.in);
        AddBook book = new AddBook();
        List list;
        Inventory inventory;
        Borrowed borrowed;
        Available available;


        String addbookAnswer = " ";
        String listAnswer = " ";
        String borrowedAnswer = " ";



        boolean addBookDone = false;
        boolean listDone = false;
        boolean borrowedDone = true;

        boolean stop = false;

        int option;
        int choice;

        ArrayList<Inventory> allInventory = new ArrayList<>();
        ArrayList<List> lists = new ArrayList<>();
        ArrayList<AddBook> addBooks = new ArrayList<>();
        ArrayList<Borrowed>borroweds= new ArrayList<>();



        //MENU

        do {

            System.out.println("1.List Books:");
            System.out.println("2.Add a book:");
            System.out.println("3.Borrow a book:");

            System.out.println("Enter you option here: ");
            option = keyboard.nextInt();
            keyboard.nextLine();


            if (option == 1) {

                do {

                    //Set Inventory
                    Inventory harryPotter = new Inventory("HarryPotter", "J.K Rowling", "1997", "4453");
                    Inventory computerSystem = new Inventory("ComputerSystem", "Lee Thomas", "1991", "4773");
                    Inventory howToCook = new Inventory("HowToCook", "Brandon Gatling", "2017", "7777");

                    //Set List
                    List Library = new List("West wing section has");
                    lists.add(Library);

                    Library.has(harryPotter);
                    Library.has(computerSystem);
                    Library.has(howToCook);

                    for (List eachList : lists) {
                        System.out.println(eachList.getRecord() + " " + "'s inventories: ");
                        for (Inventory eachInventory : eachList.getInventories()) {
                            System.out.println("/t" + eachInventory.getBookTitle() + " " + eachInventory.getBookAuthor()
                                    + " " + eachInventory.getBookYearOfPublication() + " " + eachInventory.getBookIsbnNumber());
                        }
                    }

                    System.out.println("Do you want to make another selection?");
                    listAnswer = keyboard.nextLine();


                    if (listAnswer.equalsIgnoreCase("Yes") || listAnswer.equalsIgnoreCase("yes"))
                        listDone = true;

                    else listDone = false;


                } while (!listDone);

            } else if (option == 2) {

                do {

                    System.out.println("Add a book here: ");

                    System.out.println("Enter title of book:");
                    book.setTitle(keyboard.nextLine());
                    System.out.println("Enter author of book: ");
                    book.setAuthor(keyboard.nextLine());
                    System.out.println("Enter year of publication: ");
                    book.setYearOfPublication(keyboard.nextLine());
                    System.out.println("Enter ISBN: ");
                    book.setIsbnNumber(keyboard.nextLine());
                    System.out.println("Is the item borrowed?  Type Yes/Or:");

                    if (keyboard.nextLine().equalsIgnoreCase("Yes")) {
                        book.setBorrowed(true);
                    } else {

                        book.setBorrowed(false);
                    }


                    addBooks.add(book);

                    System.out.println("HERE ARE THE BOOKS YOU ADDED!!: ");
                    System.out.println("*****************************************************************");
                    System.out.println("BOOK INFORMATION");
                    System.out.println("*****************************************************************");

                    for (AddBook eachAddBooks : addBooks) {
                        System.out.println("Book title: " + eachAddBooks.getTitle());
                        System.out.println("Author: " + eachAddBooks.getAuthor());
                        System.out.println("Year of Publication: " + eachAddBooks.getYearOfPublication());
                        System.out.println("ISBN: " + eachAddBooks.getIsbnNumber());
                        System.out.println("Borrowed: " + eachAddBooks.isBorrowed());
                    }


                    System.out.println("Would you like to add more books to your cart?: ");
                    addbookAnswer = keyboard.nextLine();
                    if (addbookAnswer.equalsIgnoreCase("no"))
                        addBookDone = true;


                } while (!addBookDone);


        } else if (option == 3) {

                do{

                    //Set Inventory
                    Available howToLearn101 = new Available("How to learn 101");
                    Available howToBeBlack202 = new Available("How to be black 202");
                    Available embraceHappiness = new Available("Embrace Happiness");

                    //Set List
                    Borrowed Library = new Borrowed("West wing section have");
                    borroweds.add(Library);

                    Library.is(howToLearn101);
                    Library.is(howToBeBlack202);
                    Library.is(embraceHappiness);

                    for (Borrowed eachBorrowed : borroweds) {
                        System.out.println(eachBorrowed.getInStock() + " " + "  availablities: ");
                        for (Available eachAvailable : eachBorrowed.getAvailables()) {
                            System.out.println(" " + eachAvailable.getBookName());
                        }
                    }

                    System.out.println();
                    System.out.println("Would you like to checkout a book? Type Yes or no");

                    if (keyboard.nextLine().equalsIgnoreCase("Yes"))
                    {


                    }


                    System.out.println("1.How to learn 101:");
                    System.out.println("2.How to be Black 202:");
                    System.out.println("3.Embrace Happiness:");

                    System.out.println("Enter your choice here: ");
                    choice = keyboard.nextInt();
                    keyboard.nextLine();


                    if (choice == 1) {

                        System.out.println("Your choice is: How to learn 101 ");
                        Library.is(howToLearn101);

                        borroweds.add(Library);

                        System.out.println("Would you like to checkout another book?");
                        borrowedAnswer = keyboard.nextLine();
                        if (borrowedAnswer.equalsIgnoreCase("No"))
                            borrowedDone = true;


                    }else if (choice == 2)

                    {
                        System.out.println("Your choice is: How to be black 202 ");
                        Library.is(howToLearn101);

                        borroweds.add(Library);

                        System.out.println("Would you like to checkout another book?");
                        borrowedAnswer = keyboard.nextLine();
                        if (borrowedAnswer.equalsIgnoreCase("no"))
                            borrowedDone = true;
                        else borrowedDone = false;

                    }else if (choice == 3) {
                        System.out.println("Your choice is: Embrace Happiness ");
                        Library.is(embraceHappiness);

                        borroweds.add(Library);

                        System.out.println("Would you like to checkout another book?");
                        borrowedAnswer = keyboard.nextLine();
                        if (borrowedAnswer.equalsIgnoreCase("no"))
                            borrowedDone = true;

                    }

                /*    for (Borrowed eachBorrowed : borroweds)
                    {
                        System.out.println(eachBorrowed.getInStock()+" "+"checked books: ");
                        for (Available eachAvailable : eachBorrowed.getAvailables()){
                            System.out.println(" "+eachAvailable.getBookName());
                        }
                    }
*/

                } while (!borrowedDone);

            }

        } while (!stop);

        {
            System.out.println("Good bye");
        }


    }
}


