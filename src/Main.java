import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] amounts = new double[4];
        Scanner input = new Scanner(System.in);
        String category = "";
        System.out.println("Welcome to Expense Tracker!");
        do {
            System.out.println("Enter the category (food, rent, utilities, others): ");
            category = input.nextLine();
            switch (category) {
                case "food":
                    System.out.println("Enter the amount of food: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Please enter a valid amount: ");
                        input.nextDouble();
                    }
                    amounts[0] = input.nextDouble();
                    input.nextLine();
                    break;
                case "rent":
                    System.out.println("Enter the amount of rent: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Please enter a valid amount: ");
                        input.nextDouble();
                        input.nextLine();
                    }
                    amounts[1] = input.nextDouble();
                    input.nextLine();
                    break;
                case "utilities":
                    System.out.println("Enter the amount of utilities: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Please enter a valid amount: ");
                        input.nextDouble();
                        input.nextLine();
                    }
                    amounts[2] = input.nextDouble();
                    input.nextLine();
                    break;
                case "others":
                    System.out.println("Enter the amount of others: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("Please enter a valid amount: ");
                    }
                    amounts[3] = input.nextDouble();
                    input.nextLine();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid category! Using 'others' by default.");
                    break;

            }
        }while (!category.equals("exit"));
        displayExpenses(amounts);

    }

    static void displayExpenses(double[] amounts) {
        System.out.println("------ Tracked Expenses ------");
        System.out.printf("%-20s %10s%n", "Category", "Amount");
        System.out.printf("%-20s %10.2f%n", "Food", amounts[0]);
        System.out.printf("%-20s %10.2f%n", "Rent", amounts[1]);
        System.out.printf("%-20s %10.2f%n", "Utilities", amounts[2]);
        System.out.printf("%-20s %10.2f%n", "Others", amounts[3]);
        System.out.printf("%-20s %10.2f%n","Total",getTotalExpenses(amounts));

    }

    static double getTotalExpenses(double[] amounts) {
        double total = 0.0;
        for (int i = 0; i < amounts.length; i++) {
            total += amounts[i];
        }
        return total;
    }
}