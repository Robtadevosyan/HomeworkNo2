import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {

       Scanner num  = new Scanner(System.in);
       int first,second,result;

        System.out.println("Enter first value:");
         first = num.nextInt();
        System.out.println("Enter second value:");
        second = num.nextInt();
        result = first + second;

        System.out.println("Result is: " + result);
        result = first - second;
        System.out.println("Result is: " + result);
        result = first * second;
        System.out.println("Result is: " + result);
        result = first / second ;
        System.out.println("Result is: " + result);
        int a = 5;
        a =
                num.nextInt();
        switch(a){
            case 1:
            System.out.println("Going first floor");
            break;
            case 2:
                System.out.println("Going second floor");
                break;
            case 3:
                System.out.println("Going third floor");
                break;
            case 4:
                System.out.println("Going fourth floor");
                break;
            case 5:
                System.out.println("Going fifth floor");
                break;
            default:

        }

        }
    }


