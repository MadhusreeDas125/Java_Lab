import java.util.Scanner;

class Tender {
    String companyName;
    double cost;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        companyName = sc.next();
        System.out.print("Enter Cost: ");
        cost = sc.nextDouble();
    }
}

public class TenderMain {
    public static void main(String[] args) {
        Tender[] tenders = new Tender[5];
        int minIndex = 0;

        for (int i = 0; i < 5; i++) {
            tenders[i] = new Tender();
            tenders[i].accept();
            if (tenders[i].cost < tenders[minIndex].cost) {
                minIndex = i;
            }
        }

        System.out.println("\nCompany with Minimum Cost: " + tenders[minIndex].companyName);
    }
}