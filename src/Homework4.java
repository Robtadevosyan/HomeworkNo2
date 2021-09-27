import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;

        System.out.println("Enter first value:");
        first = num.nextInt();
       // int a = 0;

        if (first % 2 == 0) {

            System.out.println("Arithmetic averiage is: " + first / (first / 2));
        }
        for (int i = 1; i < 17; i += 3) {
            System.out.println("Result" + i);
        }
        int five;
        int p = 1;
        int summary = 0;
        System.out.println("Enter 5 integers");
        do {
            five = num.nextInt();
            summary += five;
            p++;
        }
        while (p <= 5);
        {
            System.out.println("Summary" + summary);
        }
        System.out.println("Enter your number");
        int scanner = num.nextInt();

        {
            System.out.println("Cube of" + scanner + "is" + (scanner*scanner*scanner));
        }
    }
}



