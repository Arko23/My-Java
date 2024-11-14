package problem_b_2;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Account[] account = new Account[100];
            int i = 0;
            while (true) {
                System.out.println("Choose option : ");
                System.out.println("1. Add an account");
                System.out.println("2. Deposit money to an account");
                System.out.println("3. Withdraw money from an account");
                System.out.println("4. Show balance of all the account");
                System.out.println("5. Update information of the account");

                int choice = scan.nextInt();
                scan.nextLine();

                if (choice == 1) {
                    System.out.print("\nEnter name : ");
                    String n = scan.nextLine();
                    System.out.print("\nEnter ID : ");
                    int id = scan.nextInt();
                    System.out.print("\nEnter the amount of money : ");
                    double a = scan.nextDouble();
                    account[i] = new Account(n, id, a);
                    i++;
                } else if (choice == 2) {
                    System.out.println("Enter the amount of deposit : ");
                    double dep = scan.nextDouble();
                    System.out.print("\nEnter the id of the account : ");
                    int target = scan.nextInt();
                    int k;
                    for (k = 0; k < i; ++k) {
                        if (account[k].getId() == target) {
                            account[k].deposit(dep);
                        }
                    }
                } else if (choice == 3) {
                    System.out.print("Enter the ammount to withdraw : ");
                    double cut = scan.nextDouble();
                    System.out.print("\nEnter the id of the account : ");
                    int target = scan.nextInt();
                    int k;
                    for (k = 0; k < i; ++k) {
                        if (account[k].getId() == target) {
                            account[k].withDraw(cut);
                        }
                    }
                } else if (choice == 4) {
                    System.out.println("Here are the details :");
                    int j;
                    for (j = 0; j < i; ++j) {
                        System.out.print("Name    :" + account[j].getName());
                        System.out.print("\nID      : " + account[j].getId());
                        System.out.print("\nBalance :" + account[j].getAmount());
                        System.out.println("\n");
                    }
                } else if (choice == 5) {
                    System.out.print("\nEnter the id of the account : ");
                    int target = scan.nextInt();
                    int k, indice = 0;
                    for (k = 0; k < i; ++k) {
                        if (account[k].getId() == target) {
                            indice = k;
                        }
                    }
                    System.out.println("Which information you want to change :");
                    System.out.println("1. Change name");
                    System.out.println("2. Change id");
                    System.out.println("3. Change the amount");
                    int chse = scan.nextInt();
                    scan.nextLine();
                    if (chse == 1) {
                        System.out.print("\nEnter name: ");
                        String n = scan.nextLine();
                        account[indice].setName(n);
                    } else if (chse == 2) {
                        System.out.print("\nEnter Id : ");
                        int newId = scan.nextInt();
                        account[indice].setId(newId);
                    } else if (chse == 3) {
                        System.out.print("\nEnter amount : ");
                        double newMoney = scan.nextDouble();
                        account[indice].setAmount(newMoney);
                    } else {
                        System.out.print("Not a valid option!");
                    }
                } else {
                    System.out.println("Not a valid option...");
                }
            }

        }

    }