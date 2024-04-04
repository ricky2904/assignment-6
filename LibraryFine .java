import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days overdue: ");
        int daysOverdue = scanner.nextInt();
        double fine = 0.0;
        if (daysOverdue <= 7) {
            fine = daysOverdue * 0.5;
        } else if (daysOverdue <= 14) {
            fine = 7 * 0.5 + (daysOverdue - 7) * 1.0;
        } else if (daysOverdue <= 21) {
            fine = 7 * 0.5 + 7 * 1.0 + (daysOverdue - 14) * 5.0;
        } else {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
            return;
        }
        System.out.println("Fine for returning the book " + daysOverdue + " days late: Rs. " + fine);

        scanner.close();
    }
}
